package inheritance;


 class K {
	 K(){
		 System.out.println("we are in K constructor");
	 }void abs(){
		 System.out.println("we are in K class and in abs method");
	 }
 }class L extends K {
	 int c;
	 L(int c){
		 super();
		 System.out.println("we are in L clas constructor");
	 }void abcd(){
		 System.out.println("we are in L class and in the abcd method");
		 System.out.println("value of c is "+c);
	 }
 }class M extends L{
	 M(double d){
		 super(34);
		 System.out.println("we are in M constructor");
		  }void pqr(){
			  System.out.println("we are in class M and in pqr method");
			  
		  }
 }
public class A4 {
   public static void main(String[]args) {
	   System.out.println("hello program");
	   M s1=new M(67.89);
	   System.out.println("call the method and print the output");
	   s1.pqr();
	   s1.abcd();
	   s1.abs();
	   L s2= new L(2);
	   
   }
}
