package twentytwo;

public class accessprotectmembers {
	public static void main(String[] args) {
		accessprotectmembers s1= new accessprotectmembers();
		System.out.println("accessing protected members from another class within same package");
		System.out.println(s1.accno);
		s1.displayaccno();
	}
}
