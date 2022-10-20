package pakages;

public class pakage1 {
      protected int age=12;
      void print() {
    	  System.out.println("Hello");
      }
    	  public static void main(String[] args) {
  			
  			pakage1 p1=new pakage1();
  			System.out.println("Accessing default members from another class within same package");
  			System.out.println(p1.age);
  			p1.print();
  		}
}

   class AccessDefaultMembers2 {
	   public static void main(String[] args) {
		   DefaultMembers p1= new DefaultMembers();
			  System.out.println("accessing default members from the child from same package but different class");
			  System.out.println(p1.accno);
			  p1.displayaccno();
		  
}
   }