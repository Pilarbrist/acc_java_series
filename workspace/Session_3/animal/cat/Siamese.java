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
	
	public Siamese(String name) {
		if (name != null) {
			this.name = name;
		}
	}
	public static void main(String[] args) {
		Siamese cat = new Siamese("Blue");
		System.out.println(cat.name + " has eggs? " + cat.eggs);
		
	}

}
