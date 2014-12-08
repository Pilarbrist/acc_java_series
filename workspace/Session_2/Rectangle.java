/**
 * 
 */

/**
 * @author pi
 *
 */
public class Rectangle {

	private float length;
	private float width;
	
	public Rectangle() {
		this.length = 1.0f;
		this.width = 1.0f;
	}
	
	public Rectangle(float new_length, float new_width) {
		this();  // default sides to 1.0f
		if (dimensions_ok(new_length)) {
		    this.length = new_length;
		}
		if (dimensions_ok(new_width)) {
		    this.width = new_width;
		}
	}
		
	public float getLength() {
		return this.length;
	}
	
	public void setLength(float new_length) {
		if (dimensions_ok(new_length)) {
		    this.length = new_length;
		}
	}

	public float getWidth() {
		return this.width;
	}
	
	public void setWidth(float new_width) {
		if (dimensions_ok(new_width)) {
		    this.width = new_width;
		}
	}

	private boolean dimensions_ok(float test_dimension) {
		if (test_dimension > 1.0f && test_dimension <= 50.0f) {
			return true;
		}
		return false;
	}
	
	private float area() {
		return this.length * this.width;
	}
	
	private float perimeter() {
		return this.length * 2 + this.width * 2;
	}
	
	private void printSides() {
		System.out.println("Length: " + this.length + " Width: " + this.width);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Drive tests of this class
		// happy path 
		Rectangle rect = new Rectangle();
		System.out.println("[Sides should be 1,1]");
		rect.printSides();
		rect = new Rectangle(2, 3);
		System.out.println("[Sides should be 2,3]");
		rect.printSides();
		System.out.println("Using getters, Length: " + rect.getLength() 
				                      + " Width: " + rect.getWidth());
		rect.setLength(4f);
		rect.setWidth(5f);
		System.out.println("[Sides should be 4,5]");
		rect.printSides();
		System.out.println("[Area] " + rect.area());
		System.out.println("[Perimeter] " + rect.perimeter());
	    // error path	
		rect = new Rectangle(0, -3);
		System.out.println("[Sides should be 1,1]");
		rect.printSides();
		rect.setLength(-4f);
		rect.setWidth(-5f);
		System.out.println("[Sides should be 1,1]");
		rect.printSides();
	}

}
