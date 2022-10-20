package Interface;
    interface printable1{
    	void print();
    } interface drawable1 {
    	void print();
    }
public class Interface4 implements printable1,drawable1 {
		public  void print() {
			  System.out.println("hello print");
		  } public static void main (String[]args) {
			  Interface4 s1= new Interface4();
			  s1.print();
			  printable1 s2= new Interface4();
			  s2.print();
			  drawable1 s3= new Interface4();
			  s3.print();
		  }
	 }

