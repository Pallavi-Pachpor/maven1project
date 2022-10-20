package wrapperclass;

import org.omg.Messaging.SyncScopeHelper;

//Throwing Unchecked Exception
public class ExceptionHandling10 {
    public static void validateage(int age) {
    	if(age<18) {
    		throw new ArithmeticException("person is not eligible to vote");
    	}else {
    		System.out.println("person is eligible to vote");
    	}
    }
	public static void main(String[] args) {
   //   validateage(13);
		try {
			System.out.println("we are in try block");
			validateage(14);
			System.out.println("try block ends");
		}catch(ArithmeticException p) {
			System.out.println("we are in catxh block");
			System.out.println("exception handled....");
			System.out.println(p);
		}System.out.println("rest of the code........");
		
	}

}
