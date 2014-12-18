

import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.ParseException;


/**
 * @author pi
 *
 */
public class Lotto {

    LotteryDrawing simulator;
	private int num_lotto_balls = 6;
	private int max_ball_num = 54;
	private int simulation_years = 1;
	
	private long calc_odds() {
		int[] ball_array = new int[max_ball_num];
		long the_odds = 1L;

		// Method A: use an array with all balls 1 .. max_ball_num
		for (int i = 1; i < max_ball_num + 1; i++) {
			ball_array[i - 1] = i;
		    //System.out.println("ball_array[" + (i-1) + "] is " + ball_array[i-1]);
		}

		// use last NUM_LOTTO_BALLS to calculate odds
		// Q: can the odds overflow? (try changing the_odds to a short)

		for (int i = 1; i < num_lotto_balls + 1; i++) {
			the_odds *= ball_array[max_ball_num - i];
		    //System.out.println("the_odds: " + the_odds );
		}
		
		// Method B: use an array of just the balls needed for calculation
		ball_array = new int[num_lotto_balls];
		the_odds = 1L;
		for (int i = 0; i < num_lotto_balls; i++) 
			ball_array[i] = max_ball_num - i;
		for (int i : ball_array)
			the_odds *= i;
		
		// Method C: don't use an array
		the_odds = 1L;
		int the_ball_number = max_ball_num;
		for (int i = 0; i < num_lotto_balls; i++) 
			the_odds *= the_ball_number--;
	
	    return the_odds;	
	}
	
	private void print_results() {
		// prints a short report of simulation results
		System.out.println("\n--Lottery Drawing Report--");
		int i = 0;  // match counter
		System.out.println("Matches   Count  Percent");
		for (int next_result : simulator.get_results()) {  // print one line per result
			System.out.printf("%7s %7s %7.1f%%\n", i++, next_result, 
					          (next_result/(simulation_years*104.))*100.);
		}
	}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// get command line options using Apache CLI project
		//  -b <integer number of lotto balls> (default 6)
		//  -p <integer max ball number> (default 54)
		//  -y <integer number of years to simulate> (default 1)
		
		Lotto lotto = new Lotto();  // instantiate ourself 

		System.out.printf("The raw args are: ");
		for (String arg : args) {
			System.out.printf(" %s", arg);
		}
		
		Options options = new Options(); // instructions for commmand line parser
		options.addOption("b", true, "Number of balls (default 6)");
		options.addOption("p", true, "Max ball number (default 54)");
		options.addOption("y", true, "Years to simulate (default 1)");
		CommandLineParser parser = new BasicParser();

		try {  // protect this code in case of ParseException
			CommandLine cmd = parser.parse( options, args);
			if (cmd.hasOption("b")) {
   		        lotto.num_lotto_balls = Integer.parseInt(cmd.getOptionValue("b"));
			}
			if (cmd.hasOption("p")) {
   		        lotto.max_ball_num = Integer.parseInt(cmd.getOptionValue("p"));
			}
			if (cmd.hasOption("y")) {
   		        lotto.simulation_years = Integer.parseInt(cmd.getOptionValue("y"));
			}
		}
		catch (ParseException ex) {  // catch the ParseException
			System.out.println("Sorry...bad args");
			System.exit(128);
		}
		
		System.out.println("\nThe odds are 1 in " + lotto.calc_odds() 
				            + " using " + lotto.num_lotto_balls + " balls and " 
				            + lotto.max_ball_num + " ball numbers");

        lotto.simulator = new LotteryDrawing(lotto.num_lotto_balls,
        		                                      lotto.max_ball_num,
        		                                      lotto.simulation_years);
        lotto.simulator.run_simulation();
        lotto.print_results();
	}

}
