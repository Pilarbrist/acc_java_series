import java.util.Random;

/**
 * @author pi
 *
 */
public class LotteryDrawing {
	
	private int num_lotto_balls;  // number of balls used in each drawing
	private int max_ball_number;  // max ball number
	private int simulation_years;  //number of years to run simulation
	private int simulation_drawings;  // number of drawings in simulation @ 2/week
	private int[] results;  // keeps track of simulation results
	
	public int[] get_results() {
		return results;
	}
	
	public LotteryDrawing(int num_lotto_balls,
			              int max_ball_number,
			              int simulation_years) {
		this.num_lotto_balls = num_lotto_balls;
		this.max_ball_number = max_ball_number;
		this.simulation_years = simulation_years;
		init();
	}
	
	private void init() {
		// initialize the simulation (could be done in a constructor too)
		results = new int[num_lotto_balls + 1];  // create results array
		for (int i = 0; i < results.length; i++) results[i] = 0;  // initialize results 
		simulation_drawings = simulation_years*104;  // two drawings per week
	}
	
	private int intersection(int[] a, int[] b) {
		// returns the intersection (numbers in common) between int[] a and int[] b
		int matches = 0;
		for (int next_a : a) {
			for (int next_b : b) {
				if (next_a == next_b) {
					matches++;
					break;
				}
			}
		}
		return matches;
	}

	public void run_simulation() {
		// simulates a virtual lottery for simulation_drawings number of drawings
		for (int drawing = 0; drawing < this.simulation_drawings; drawing++) {
    		int[] official_picks = pick_numbers(); // get the official winning numbers
		    int[] user_picks = pick_numbers(); // get the user's quick picks
		    results[intersection(official_picks, user_picks)]++;  // bump the results bucket
		}
	}
	
	private boolean already_have(int[] a, int n) {
		// returns true if int[] a contains int n, else false
		for (int next_a : a) {
			if (next_a == n)  return true;
		}
		return false;
	}

	private int[] pick_numbers() {
		// returns an int[] of unique random integers from 1 .. max_ball_num
        Random rand = new Random();  // get new generator
        int[] new_picks = new int[num_lotto_balls];  // and new picks array
        int new_pick;
        
        for (int i=0; i < num_lotto_balls; i++) {
        	do {
                new_pick = rand.nextInt(max_ball_number);
        	}
            while (already_have(new_picks, new_pick)) ;  // generate again if already have this number
            new_picks[i] = new_pick;  // have a unique one so go with it
            }
		return new_picks;
        }

	private void validate() {
		// sanity check inputs i.e. not negative, too big, too small, etc.
		// left to discretion of student
	}

	public static void main(String[] args) {
		// quick test driver if class run directly
		LotteryDrawing lottery_drawing = new LotteryDrawing(6, 54, 10000); // can we win in 10,000 years?
	    int[] pick_numbers = lottery_drawing.pick_numbers();
	    //for (int next_pick : pick_numbers) System.out.printf(" %s", next_pick);
	    lottery_drawing.run_simulation();
	    System.out.printf("\n\nResults: ");
	    for (int next_result : lottery_drawing.results) System.out.printf(" %s", next_result);
	    
	}
}
