package wrapperclass;
//exception occurs and handled 
public class ExceptionHandling9 {

	public static void main(String[] args) {
	 try {
		 System.out.println("we are in try block");
		// below code throws divide by zero exception
		 int data =30/0;
		 System.out.println(data);
		 
	 }
	// handles the Arithmetic Exception / Divide by zero exception
	 catch(ArithmeticException p) {
		 System.out.println("we are in catch block");
		 System.out.println("exception handled");
		 System.out.println(p);
	 }finally {
		 System.out.println("finally block will always execute");
	 }System.out.println("rest of the code....");

	}

}
