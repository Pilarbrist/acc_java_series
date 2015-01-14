
public class EqualsOperator {

	public static void main(String[] args) {
		// Show == operator vs. equals() method
		String a = new String("string1");
		String b = new String("string1");
		String c = "string1";
		String d = "string1";
		System.out.println("Is a == b? " + (a == b));
		System.out.println("Is a.equals(b)? " + a.equals(b));
		System.out.println("Is c == d? " + (c == d));
		
		// Show autoboxing/unboxing
		Integer q = 8;
		System.out.println("\nq is a " + q.getClass());
		int r = q / 2;
		System.out.println("r is " + r);

	}

}
