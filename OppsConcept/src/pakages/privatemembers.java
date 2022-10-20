package pakages;

public class privatemembers {
   private int accno=1234;
   private void displayaccno() {
	   System.out.println("accno:"+accno);
   }  public static void main(String[] args) {
	   privatemembers p2=new privatemembers();
	   System.out.println(p2.accno);
	   p2.displayaccno();
   }
}class AccessPrivateMembers2 {

	public static void main(String[] args) {
		
//		PrivateMembers p1=new PrivateMembers();   we cannot access the private members outside the class
//		System.out.println(p1.accNum);
//		p1.displayAccNum();
	}
}
/**
 * private member are accessible with in class only                       
 */
