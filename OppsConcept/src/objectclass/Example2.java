package objectclass;

public class Example2 extends demo {
	static int last_roll = 100;
	int roll_no;

	// Constructor
	Example2() {
		roll_no = last_roll;
		last_roll++; //101
	}

	// Driver code
	public static void main(String args[]) {
		Example2 s = new Example2();
		// Below two statements are equivalent
		System.out.println(s);        //objectclass.Example2@...
		System.out.println(s.toString());
		System.out.println(s.hashCode()); // it convert hexadecimal address in to decimal and return the value
		demo s2 = new Example2();

		System.out.println(s2);
		System.out.println(s2.toString());
		System.out.println(s2.hashCode());
	}
}
