package twentytwo;

public class protectmembers {
	protected  int accno=1234;
     protected void displayaccno() {
      	System.out.println("account number :"+accno);
      } public static void main(String[] args) {
      	Defaultmembers s1= new Defaultmembers();
      	System.out.println(s1.accno);
      	s1.displayaccno();
      }
} class Accessprotectmembers{
	 public static void main(String[] args) {
	      	Defaultmembers s1= new Defaultmembers();
	      	System.out.println("accessing protected members from the child class");
	      	System.out.println(s1.accno);
	      	s1.displayaccno();
	      }
}

/**
 * protected members are accessible with in package 
 * but can be access these member from outside the package using inheritance
 */