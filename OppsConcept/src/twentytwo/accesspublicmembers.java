package twentytwo;

public class accesspublicmembers {
	public static void main(String[] args) {
		accesspublicmembers s1= new accesspublicmembers();
		System.out.println("accessing the default members from anather class within same package");
		System.out.println(s1.accno);
		s1.displayaccno();
	}
}
