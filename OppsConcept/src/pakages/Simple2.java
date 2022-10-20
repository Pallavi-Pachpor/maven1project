package pakages;

public class Simple2 {
		void display() {
			System.out.println("Display of Simple");
		}
		public static void main(String args[]) {
			System.out.println("Welcome to package");
			 DefaultMembers p1= new DefaultMembers();
			  System.out.println("accessing default members from the child class");
			  System.out.println(p1.accno);
			  p1.displayaccno();
		  }

		}
	

