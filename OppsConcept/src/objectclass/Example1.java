package objectclass;
 
class demo {
	void display() {
		System.out.println("In the display method");
	}
}

public class Example1 extends demo {
	static int last_roll = 100;
	int roll_no;

	Example1() {
		roll_no = last_roll;
		last_roll++;
	}

	public static void main(String args[]) {
		demo d1 = new demo();
		System.out.println(d1); // d1.toString(); its output is packagename.classname...
		demo d2 = new demo();
		System.out.println(d1.toString());
		System.out.println("**************************");
		Example1 s = new Example1();
		System.out.println(s);
		System.out.println(s.toString()); // these two will give same output //it is the string representation of the
											// object
		System.out.println("*******************************");
		demo d3 = new Example1();
		System.out.println(d3);
		System.out.println("*****************************");
		System.out.println(new Example1());
	}
}

/**
 * string representation---> fullyqualifiedclassname@hexadecimaladdress	
 * 							 packagename.classname@hexadecimaladdress
 * 
 */
