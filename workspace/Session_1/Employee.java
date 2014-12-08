/**
 *   Course: Java 1
 *   Assn: Homework 1
 *   Date: 12/3/2014 
 */

/**
 * @author pi
 *
 */
public class Employee {
	
	// Instance vars
	String first_name;
	String last_name;
	double salary;  // monthly
	
	public Employee(String first, String last) {
		// Constructor to initialize just the employee name
		if (first != null && last != null) {
			this.first_name = first;
			this.last_name = last;
		}
	}
	
	public Employee(String first, String last, double salary) {
		this(first, last); // use the constructor that sets names
		this.salary = salary;
	}
	
	// Other methods
	public String get_first_name() {
		return this.first_name;
	}
	
	public void set_first_name(String new_name) {
		this.first_name = new_name;
	}
	
	public String get_last_name() {
		return this.last_name;
	}
	
	public void set_last_name(String new_name) {
		this.last_name = new_name;
	}
	
	public double get_salary() {
		return this.salary;
	}
	
	public void set_salary(double new_salary) {
		if (new_salary > 0d) {
	  	    this.salary = new_salary;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Drives the test application
		Employee employee_1 = new Employee("Joe","Dixon");
		employee_1.salary = 8200d;
		Employee employee_2 = new Employee("Lisa","Dixon",12800d);
	    
		System.out.println("\nEmployee: " + employee_1.first_name + " " 
		                                  + employee_1.last_name + " yearly salary is $"
		                                  + employee_1.salary*12);
		System.out.println("\nEmployee: " + employee_2.first_name + " " 
		                                  + employee_2.last_name + " yearly salary is $"
		                                  + employee_2.salary*12);
		System.out.println("\nAll employees get 10% raise (Yay!)");

		employee_1.set_salary(employee_1.get_salary()*1.10d);  // Give raises
		employee_2.set_salary(employee_2.get_salary()*1.10d);

		System.out.println("\nEmployee: " + employee_1.first_name + " " 
		                                  + employee_1.last_name + " yearly salary is now $"
		                                  + employee_1.salary*12);
		System.out.println("\nEmployee: " + employee_2.first_name + " " 
		                                  + employee_2.last_name + " yearly salary is now $"
		                                  + employee_2.salary*12);

		//System.out.printf("\nEmployee: %s %s yearly salary is $%6.2f", employee_2.first_name, 
		//		                                                         employee_2.last_name, 
	    //	                                                             employee_2.salary*12);
	}

}
