package inheritance;

class grandfather {
	grandfather() {
		System.out.println("in the grandfather constructor");
	}

	void t() {
		System.out.println("parant class method");
	}
}

class father extends grandfather {
	father(double d) {
		System.out.println("in the father constructor");
	}

	void y() {
		System.out.println("In the y method");
	}
}

class child1 extends father {

	child1() {
		super(2.3);
		System.out.println("In the child1 constructor with int parameter");

	}

	void u(double j) {
		System.out.println("In the u method");
	}
}

public class A13 {
	public static void main(String[] args) {
		System.out.println("hello");
		child1 s1 = new child1();
		s1.t();
		s1.y();
		s1.u(2.2);
	}
}
