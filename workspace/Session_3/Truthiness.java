
public class Truthiness {

	public static void check(Object test) {
		// returns the "truthiness" of test object as a boolean
		if (test != null) {
		    System.out.printf("\n%s is %b", test.toString(), test);
		}
		else {
		    System.out.printf("\n%s is %b", test, test);
		}
	}
	
	public static void main(String[] args) {
		Truthiness.check("hi");
		Truthiness.check(0);
		Truthiness.check(null);
		Truthiness.check(false);
	}
}
