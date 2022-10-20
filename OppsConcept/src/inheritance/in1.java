package inheritance;
       
class fruit{
	fruit(){
		System.out.println("we are in fruit constructor");
	} public void print() {
		System.out.println("we are in print method");
	}
}
	class apple1 extends fruit{
		apple1(){
		//	super();
			System.out.println("we are in apple constructor");
		}public void run() {
			System.out.println("we are in run method");
		}
	}


public class in1 {
         public static void main(String []args) {
        	 System.out.println("hello program");
       fruit s1=new fruit ();
       	   s1.print();
       	 apple1 s2=new apple1();
       	 s2.run();
       	 s2.print();
    
       	
         }
}


