public class Butterfly {

	Boolean b2 = true;
	private boolean b3 = false;
	protected static String s2 = "s2";
	
	//public Butterfly() {}
	//
	//public Butterfly(int x) {
	//	System.out.println("Rcvd " + x);
	//}
	
	public static void main(String[] args) {
		
		Butterfly h = new Butterfly(); // base class 
		Monarch s = new Monarch();  // subclass 

		System.out.println("\nUsing two b2 methods: " 
		                   + h.b2.getClass() + " " 
		                   + Boolean.compare(h.b2, true));
		//System.out.println("\nb2: " + super.b2);  // ?
		//System.out.println("\nb2: " + this.b2);  // ?
		System.out.println("\nb3: " + h.b3); 
		Butterfly.s2 = "set by class reference";
		h.s2 = "set by instance reference";  
		System.out.printf("\nx4 in hex: %x\n", Monarch.x4); 
		//System.out.printf("\nx5 as a boolean: %b", s.x5); // ?
		
	}
}
