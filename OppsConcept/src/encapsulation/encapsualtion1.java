package encapsulation;

class encap {
	private int age = 12;
	private int empid = 123;
	private double salary = 100000;

	public int getAge() {
		return age;
	}

	public void setAge1(int age) {
		this.age = age;
	}

	public double getsal() {
		return salary;
	}

	public void setsal1(double salary) {
		this.salary = salary;
	}
}

public class encapsualtion1 {
	public static void main(String[] args) {
		encap s1 = new encap();
		System.out.println(s1.getAge()); // to access the private member from other class we can call the getter method
											// in println statement
		System.out.println(s1.getsal());
		// to update the value we can use the setter method
		s1.setAge1(34);
		s1.setsal1(200000);
		System.out.println("updated value is " + s1.getAge());
		System.out.println("updated value is " + s1.getsal());

	}
}
/**
 * In order to access private variable outside the class we need implement
 * getter method --> getter method--> helps to access private variable from
 * outside the class --> declared with public --> return type of this method
 * should be same as private variable --> it should return private variable In
 * order to modify private variable outside the class we need implement setter
 * method --> setter method--> helps to modify private variable from outside the
 * class --> declared with public --> return type of this method is void -->
 * parameter datatype should be same as private variable
 */
