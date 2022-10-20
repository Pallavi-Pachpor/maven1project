package wrapperclass;

import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		  System.out.println("program starts here");
		  int i,j,k;
		  Scanner scn = new Scanner(System.in);
		  System.out.println("Enter the value of i");
		   i=scn.nextInt();
		   System.out.println("Enter the value of j");
		   j= scn.nextInt();
	
	   try {
			   System.out.println("******we are in the try block");
			   k=i/j;
			   System.out.println("result:"+k);
			   System.out.println("try block ends here");
		   } catch(ArithmeticException obj) {
			   System.out.println("we are in the catch block");
			   System.out.println("Exception handled:"+obj);   //java.lang.ArithmeticException: / by zero
			   obj.printStackTrace();    //complete exception detail
			   System.out.println("exception handled");
		   } System.out.println("progrsm ends here");
	}
}


/**
1. try ---> throws some exeception -----> catch() has to catch it
2. try ---> throws some exeception -----> catch() donesn't that type of declaration dn jvm will terminate the program execution
3. try ---> doesn't have any exception -----> dn catch block will not be executed
*/


