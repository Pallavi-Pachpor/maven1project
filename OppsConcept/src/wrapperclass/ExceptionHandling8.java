package wrapperclass;
//unhandled exception in program
public class ExceptionHandling8 {

	public static void main(String[] args) {
		try {
			System.out.println("we are in try block");
			// below code throws divide by zero exception
			int data = 25/5;
	//		System.exit(0);
			System.out.println(data);
		}
		// cannot handle Arithmetic type exception
				// can only accept Null Pointer type exception
		catch(NullPointerException p) {
			System.out.println("we are in catch block");
			System.out.println("with object:"+p);
		}
		// executes regardless of exception occured or not
		finally {
			System.out.println("we are in finally block");
			int k= 20/0;
			System.out.println("k:"+k);
		}System.out.println("rest of the code");

	}

}
