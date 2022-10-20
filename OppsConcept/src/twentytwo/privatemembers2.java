package twentytwo;

public class privatemembers2 {
	     private int accno=1234;
	     private void displayaccno() {
	    	 System.out.println("account number :"+accno);
	     }public static void main(String[] args) {
	    	 privatemembers2 s1= new privatemembers2();
	    	 System.out.println(s1.accno);
	    	 s1.displayaccno();
	     }
}class AccessPrivateMembers2 {

	public static void main(String[] args) {
	 	 privatemembers2 s1= new privatemembers2();
		
		System.out.println(s1.accno);
		s1.displayaccno();
	}
}
/**
 * private member are accessible with in class only
 */