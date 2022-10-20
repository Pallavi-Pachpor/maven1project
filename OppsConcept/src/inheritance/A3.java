package inheritance;

class fruits{
	fruits(){
		System.out.println(" in parent class constructor");
	}void dis(){
		System.out.println("in parent class method");
	}
}class apple extends fruits {
	apple(){
		System.out.println("in the child class constructor");
	}void dis1(){
		System.out.println("in child class method");
	}
}

public class A3 {
	public static void main(String[]args) {
		System.out.println(" program starts");
		apple s1=new apple();
		s1.dis();
		s1.dis1();
	}

}
