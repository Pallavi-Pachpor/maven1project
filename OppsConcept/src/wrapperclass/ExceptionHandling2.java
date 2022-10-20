package wrapperclass;
import java.util.*;
public class ExceptionHandling2 {

	public static void main(String[] args) {
	  System.out.println("program starts here");
	  int i,j,k;
	  Scanner scn = new Scanner(System.in);
	  System.out.println("Enter the value of i");
	   i=scn.nextInt();
	   System.out.println("Enter the value of j");
	   j= scn.nextInt();
	   k=i/j;               //ArithmaticException    //  if we take wrong input
	   System.out.println("result:"+k);
	   System.out.println("program ends here");

	}

}
/**
1. try ---> throws some exeception -----> catch() has to catch it
2. try ---> throws some exeception -----> catch() donesn't that type of declaration dn jvm will terminate the program execution
3. try ---> doesn't have any exception -----> dn catch block will not be executed
*/
