package twentytwo;

public class Defaultmembers {
            int accno=1234;
            void displayaccno() {
            	System.out.println("account number :"+accno);
            } public static void main(String[] args) {
            	Defaultmembers s1= new Defaultmembers();
            	System.out.println(s1.accno);
            	s1.displayaccno();
            }
}class accessdefaultmembers1{
	public static void main(String[] args) {
		 accessdefaultmembers1 s1= new  accessdefaultmembers1();
		 System.out.println("accessing default members from the child class");
		 System.out.println(s1.accno);
     	s1.displayaccno();
	}
}
 
/**
default members are accessible with in package 
*/