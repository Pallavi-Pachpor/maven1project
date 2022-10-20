package Interface;
     interface printable{
    	 int age=23;
    	 void print ();
     } interface showable{
    	 void shoe();
     } 
public class Interface3 implements printable,showable {
           public static int age=56;
           public void print() {
        	   System.out.println(" hello print");
           } public void shoe() {
        	   System.out.println("hello show");
           }  public static void main (String[]args) {
        	   Interface3 s1 = new Interface3 ();
        	   s1.print();
        	   s1.shoe();
        	   System.out.println(s1.age);
        	   System.out.println(printable.age);
        	   System.out.println(Interface3.age);
           }
}
