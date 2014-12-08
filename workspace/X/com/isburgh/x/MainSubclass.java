package com.isburgh.x;

public class MainSubclass extends Main {

    static final String[] some_constants = {"Alice","Bob","Joy"};

	public MainSubclass() {
		// Default constructor
		super();  // which is also the default :)
		//super(some_constants); // what happens if we use the non-default constructor?
		System.out.println("Wasup? in MainSubclass constructor");
	}
	
	public String checkAccess() {
		// Check out a Main protected field
		//Main m = new com.isburgh.x.Main(some_constants);  
		System.out.println("this object: " + this.toString());
		System.out.println("Can we see pub? " + super.pub);
		System.out.println("Can we see prot? " + super.prot);
		return "But we get a compile error if we try to see priv...hey, I'm done";  // return the protected field
		//return this.priv;  // return the private field?
	}
	

	public static void main(String[] args) {
	    System.out.println(new MainSubclass().checkAccess().toString());	
	}
}
