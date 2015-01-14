
public class TI implements Y,Z {

	public String greeting() {
		// required by the X interface
		
		return new StringBuilder("from greeting()").substring(6)
				   + " Epiphany!";
	}

	public String another_greeting() {
		// required from the Y sub-interface
		return new String("another_greeting() says HI!");
	}

	public double get_count() {
		// required from the Z interface
		return 77d;
	}

	public static void main(String[] args) {
		TI me = new TI();
        System.out.println("\n" + me.greeting() + 
        		" \n" + me.another_greeting());
	}

}
