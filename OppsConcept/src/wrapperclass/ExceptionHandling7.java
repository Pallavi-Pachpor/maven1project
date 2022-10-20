package wrapperclass;

public class ExceptionHandling7 {

	public static void main(String[] args) {
		try {
			System.out.println("we are in try block");
			// below code do not throw any exception
			int data =34/0;
			System.out.println(data);
			}
		// catch won't be executed
		catch (ArrayIndexOutOfBoundsException obj) {
				System.out.println("we are in catch block");
				System.out.println("object :"+obj);
			}
	//	catch (ArithmeticException obj) {
	//		System.out.println("we are in catch block");
	//		System.out.println("object :"+obj);
	//	}
		// executed regardless of exception occurred or not
		finally {
				System.out.println("we are in finally block");
				System.out.println("finally block will always execute");
			}System.out.println("rest of the code");

	}

}
