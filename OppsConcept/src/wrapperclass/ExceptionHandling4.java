package wrapperclass;
 import java.util.*;
public class ExceptionHandling4 {

	public static void main(String[] args) {
		System.out.println("program starts");
	 Scanner scn = new Scanner(System.in);
	 System.out.println("enter the array size");
	  int size= scn.nextInt();
	  int arr[] = new int[size];
	  try {
		  System.out.println("we are in try block");
		  System.out.println(arr[3]); 
		  System.out.println("try block ends");
	  }catch(Throwable e) {
		  System.out.println("we are in catch block");
		  System.out.println("exception object"+e);
		  e.printStackTrace();                      
		  System.out.println("get messege:"+e.getMessage());
		  System.out.println("catch block ends ");
	  } System.out.println("program ends");
	} 

}
