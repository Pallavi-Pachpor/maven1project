package abstractclass;

abstract class company { // abstract class
	final int age = 45;
	static int empid = 123;
	int salary = 12345;

	abstract void run(); // abstract method

	void print() {
		System.out.println("this is a normal method");
	}
}

class department extends company { // inheritance
	void run() { // overridden method
		int empid = 34;
		System.out.println("this is a abstract method");
		System.out.println(this.empid); //123
		System.out.println(empid); // normal method  //34
	}

	void display() {
		System.out.println("this is the child class method");
		System.out.println(salary);
		System.out.println(age);
		System.out.println(empid);
		super.print();
	}
}

public class practice1 {
	public static void main(String[] args) {
		System.out.println("hello");
		department s1 = new department();
		s1.print();
		s1.run();
		s1.display();
		company s2 = new department(); // create object with reference of parent
		s2.print();
		s2.run();
		// s2.display(); // we cannot access child method because we take the reference
		// of parent to create the object

	}
}
