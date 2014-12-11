/**
 * 
 */
package animal.cat;

import animal.Mammal;
/**
 * @author pi
 *
 */
public class Siamese extends Mammal {
	
	private String name = "Cat";
	private static final String eye_color = "Blue";
	private static final String fur_color = "Brown";
	private static String[] names;
	
	static {
		names[0] = "Lucy";
		names[1] = "Sam";
		names[2] = "Whiskey";
	}
	
	public Siamese(String name) {
		if (name != null) {
			this.name = name;
		}
	}
		
	@Override
	public void hunt() {
		System.out.println("Siamese hunting");
	}

	public void hunt(String msg) {
		System.out.println("Siamese hunting: " + msg);
	}

	public static void main(String[] args) {
		Mammal my_mammal = new Mammal();
		my_mammal.hunt();
		
		Siamese cat = new Siamese("Blue");
		cat.hunt();

		new Bobcat().hunt();
		
		System.out.println(cat.name + " has eggs? " + cat.eggs);
		
	}

}
