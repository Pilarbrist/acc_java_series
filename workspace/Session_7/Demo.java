
public class Demo {

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof String) 
			result = true;
		if (obj instanceof Integer) 
			result = true;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1 = new Demo();
		System.out.println("Testing String: " + d1.equals("hi"));
		System.out.println("Testing Boolean: " + d1.equals(true));
		System.out.println("Testing Boolean: " + d1.equals(8));

	}

}
