public class Homework_2 {

/* Based on Java Tutorials book, Chapter 4
 * 
 * 1) What's the main difference between "this" and "super"? 
 * 
 * 2) In the code below, which variables belong to the instance? Which belong to the class?
 *        public class Homework_2 {
 *            Boolean b2;
 *            private boolean b3;
 *            protected static String s2;
 *            public static int x4;
 *            private short x5;
 *        }
 *        
 * 3) Name two ways that can be used to access a class variable?
 * 
 * 4) Type in the code above and a main() method that accesses each variable. Use 2 
 *    Boolean methods (see Boolean type) on b2 and print the results.
 *    
 * 5) Name 2 ways to change the value of s2? Which is more appropriate?
 * 
 * 6) Can you use "this" to access b2 from the main() method? Why or why not?
 * 
 * 7) What convention do variable and method names use for the first letter? What about 
 *    class name?
 *    
 * 8) Stretch Goal: Show how could you print x4 as a hexadecimal number? Hint: change "println"
 *    to "printf" and read its documentation
 *    
 * 9) Split the class in two, with b2, b3, s2 in Homework_2 class, and x4, x5 in a subclass 
 *    of Homework_2. Instantiate both classes. Feel free to rename things to make it more interesting for you. What 
 *    keyword is used on the class to indicate it's a subclass? Can the subclass directly 
 *    access b3 and x4? 
 *    
 *10) Create an instance of the subclass. What is missing? Go ahead and fix it.
 *
 *11) Write a PlayingCard class where each instance represents a card. Write another class
 *    called Deck that has 52 instances of the PlayingCard class. What might you use to hold 
 *    the PlayingCard instances? Write a main() method in both classes where you test all class 
 *    functionality.
 * 
 */
	Boolean b2 = true;
	private boolean b3 = false;
	protected static String s2 = "s2";
	public static int x4 = 422;
	private short x5 = 519;
	
	public static void main(String[] args) {
		
		Homework_2 h = new Homework_2();  // 4)
		System.out.println("\nUsing two b2 methods: " 
		                   + h.b2.getClass() + " " 
		                   + Boolean.compare(h.b2, true));
		Homework_2.s2 = "set by class reference";  // 5)
		h.s2 = "set by instance reference";  // 5)
		//System.out.println("\nb2: " + this.b2);  // 6)
		System.out.println("\nb3: " + h.b3);  // 6)
		System.out.printf("\nx4 in hex: %x\n", Homework_2.x4);  // 8)
		System.out.printf("\nx5 in binary: %b", h.x5);
		
	}
}
