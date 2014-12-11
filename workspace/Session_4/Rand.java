import java.util.Random;

/**
 * Homework 3 randoms numbers
 */

/**
 * @author pi
 *
 */
public class Rand {
	
	public int[] getSixRandoms(int upper_value) {
		int[] randoms = new int[6];
		for (int i = 0; i < randoms.length; i++) {
			randoms[i] = 1 + new Random().nextInt(upper_value);
		}
		return randoms;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] my_randoms = (new Rand()).getSixRandoms(17);
		int number_of_randoms = my_randoms.length;

		for (int i = 0; i < number_of_randoms; i++ ) {
			System.out.println(my_randoms[i]); 
		}

	}

}
