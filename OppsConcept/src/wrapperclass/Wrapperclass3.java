package wrapperclass;

public class Wrapperclass3 {
   public static void main(String[]args) {
	   System.out.println("program starts here");
	   //abnormal statement
//	   int i=10;
//	   int j= i/0; //ArithmaticException
//	   System.out.println("value of j is :"+j);
	 //abnormal statement 2
//		int empid[]= new int [3];  
//	empid[3]=45;    //ArrayIndexOutOfBoundException   
	//abnormal statement 3
	String s="123";
	int num = Integer.parseInt(s); //NumberFormatException
	System.out.println("num:"+num);
	System.out.println("program ends here");
	   
   }
}
