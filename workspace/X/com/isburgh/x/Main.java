/**
 * For Java 1 in-class demo use 
 */
package com.isburgh.x;

/**
 * @author pi
 *
 */

public class Main {

	int thePriceOfTeaInChina = 8;
	int instanceVar = 8;
	static Boolean someClassFlag;
	public String pub = "hey, I'm public";
	protected String prot = "hey, I'm protected";
	private String priv = "hey, I'm private";
	
	static {
		// complex static initializations
		someClassFlag = true;  // well, maybe not complex this time
	}

	{
		// if complex instance initializations, do it here
		if (thePriceOfTeaInChina == 8) {
		    instanceVar = 9*thePriceOfTeaInChina;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Drive demo
		System.out.println("Does Dude contain 'guy'? " + "Dude".contains("guy"));
		Main x = new Main(args);
		System.out.println("So, someClassFlag hash is " + someClassFlag.hashCode());
		System.out.println("So, someInstanceVar is " + x.instanceVar);

		MainSubclass y = new MainSubclass();
		System.out.println("So, is y an instance of MainSubclass? " + (y instanceof MainSubclass));
		System.out.println("So, is y an instance of Main? " + (y instanceof Main));
	}
	
	public Main(String[] runtime_argv) {
		// Constructor iff we're give a String[]
		System.out.println("In the String[] Main class constructor");
		String[] argv = new String[3];
		System.arraycopy(runtime_argv, 0, argv, 0, runtime_argv.length);
		for (String i : argv) {
			System.out.println("arg: " + i);
		}
		System.out.println("So, do we have access to someClassFlag? " + someClassFlag);
	}
	
	public Main() {
		// Default constructor...let's make up some args
		this(new String[]{"Tweety","Sylvester","Golda"});
		System.out.println("In the default Main class constructor");
	}

	public String getPriv() {
		return priv;
	}

	public void setPriv(String priv) {
		this.priv = priv;
	}

}
