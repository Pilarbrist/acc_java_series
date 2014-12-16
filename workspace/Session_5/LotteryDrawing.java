
/**
 * @author pi
 *
 */
public class LotteryDrawing {
	
	private int num_lotto_balls;
	private int max_ball_number;
	private int simulation_years;
	
	public LotteryDrawing(int num_lotto_balls,
			              int max_ball_number,
			              int simulation_years) {
		this.num_lotto_balls = num_lotto_balls;
		this.max_ball_number = max_ball_number;
		this.simulation_years = simulation_years;
	}
	
	public void run_simulation() {}

	private void init() {} 

	private int[] pick_numbers() {
		return new int[num_lotto_balls];
	}

	private void validate() {}

}
