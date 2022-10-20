package scannerclass;
 import java.util.*;
public class Add1 {
 static  int num1,num2,res;
   public static void main(String[]args) {
	   System.out.println("program to add two integer numbers");
	   Scanner add =new Scanner(System.in);
	   System.out.println("enter the num1");
	   num1 = add.nextInt();
	   System.out.println("num1 is :"+num1);
	   System.out.println("enter the num2");
	   num2 = add.nextInt();
	   System.out.println("num2 is :"+num2);
	   char op;
	  System.out.println("enter the operator");
	   op= add.next().charAt(0);
	   System.out.println("Addition of two numbers: " + addNumber(op, num1, num2));
		System.out.println("*****************************************");
	}

	static int addNumber(char op, int num1, int num2) {
		if (op == '+') {
			return num1 + num2;
		} else {
			return 0;
		}
	}
}