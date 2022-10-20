package scannerclass;
  import java.util.*;
public class Scannerclass1 {
	public static void main(String[]args) {
		int age =12;
		double salary = 1234.12;
		String name ="pallavi";
		Scanner scnref = new Scanner(System.in);     //object creation of scanner class. // scnref is the name of reference 
		boolean valid;
	 	//initialzation of variables using the scanner class
		System.out.println("Enter the age value from the console");
		age= scnref.nextInt();
		System.out.println(age);
		System.out.println("enter the value for the salary");
		salary = scnref.nextDouble();
		System.out.println("salary is :"+salary);
		System.out.println("enter the string");
		name = scnref.next();
		System.out.println("string name is :"+name);
		System.out.println("enter the true or false from the console");
		valid = scnref.nextBoolean();
		System.out.println("true or false:"+valid);
		
	}
}