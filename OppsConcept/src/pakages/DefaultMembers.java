package pakages;

public class DefaultMembers {
       int accno=1234;
       void displayaccno() {
    	   System.out.println("accno:"+accno);
       } public static void main(String[] args) {
    	   DefaultMembers p1= new DefaultMembers();
    	   System.out.println(p1.accno);
    	   p1.displayaccno();
      }
    		   
  } class AccessDefaultMembers{
	  public static void main(String[] args) {
		  DefaultMembers p1= new DefaultMembers();
		  System.out.println("accessing default members from the child class");
		  System.out.println(p1.accno);
		  p1.displayaccno();
	  }
  }
       

