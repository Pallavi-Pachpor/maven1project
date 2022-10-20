package wrapperclass;

public class ExceptionHandling6 {

	public static void main(String[] args) {
		try {
			System.out.println("we are in try block");
			int age[]=new int[5];
			age[5]= 30/0;
		}
		catch(Throwable obj) {
			System.out.println("with object only"+obj);
			System.out.println("for full address:");
			obj.printStackTrace();
/**	}catch(Exception obj) {                         //due to throwable exception after that any catch block will show that it is the unreachable code
			System.out.println("exception object:"+obj);
		}catch (Exception e) {
			//System.out.println("task1 is completed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		}
		System.out.println("rest of the code...");
*/	}

	}}

/**
* unreachable code: a block of code which never executes by JVM
*
*/
