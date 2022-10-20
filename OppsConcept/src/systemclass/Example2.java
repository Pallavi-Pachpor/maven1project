package systemclass;

class demo11 {
	demo11() {
		System.out.println("i am in demo1 constructor");
	}

	void manual() {
		System.out.println(" i am in the manual method");
	}

	void automation() {
		System.out.println("i am in the automation method");
	}
}

public final class Example2 {
	static demo11 d12 = new demo11();

	public static void main(String[] args) {
		demo11 d11 = new demo11();
		System.out.println("program starts");
		d11.manual();
		d11.automation();
		System.out.println("***********************************");
		d12.manual();
		d12.automation();
		System.out.println("************************");
		Example2.d12.manual();
		Example2.d12.automation();
		Example2 e1 = new Example2();

	}
}
