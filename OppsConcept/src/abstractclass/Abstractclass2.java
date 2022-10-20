package abstractclass;
   abstract class abs{
	   int age;
	   int rollno=98;
	   abs(){
		   System.out.println("abs constructor class");
		   System.out.println("initial value of age :"+age);
	   } void run () {
		    int rollno=56;
		   System.out.println("run method");
		   System.out.println("global rollno:"+this.rollno);
	   } abstract void print();
   } 
    class lmn extends abs{
    void print() {
    	System.out.println("abstarct print method overriden ");
    	super.run();
    }
    }
public class Abstractclass2 {
       public static void main(String[]args) {
    	   lmn s1=new lmn();
    	  s1. run();
    	  s1.print();
       }
}
