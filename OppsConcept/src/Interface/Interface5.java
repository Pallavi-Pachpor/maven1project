package Interface;
    interface printable2{
    	void print();
    } interface showable2 extends printable2{
    	void show();
 //   	void print();              it is present here virtually
    }
public class Interface5 implements showable2 {
	public void print(){
		  System.out.println("print method");
	  } public void show() {
		  System.out.println("show method");
	  } public static void main (String[]args) {
		  Interface5 s1= new Interface5();
		  s1.print();
		  s1.show();
		  printable2 s2=new Interface5();
		  s2.print();
		  showable2 s3= new Interface5();
		  s3.print();
		  s3.show();
		  
		  
	  }

}
