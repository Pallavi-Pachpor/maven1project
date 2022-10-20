package inheritance;


class A1{
	static int a=45;
	int b=56;
	double c=45.67;
}class B1 extends A1{
	static int x=89;
	int y=78;
	double z=34.45;
}class C1 extends B1{
	static int p=221;
	int q=66;
	double r=55.55;
}
public class ABC1 {
	public static void main(String []args) {
		System.out.println("program started");
		System.out.println("static member of A is :"+A1.a);
		System.out.println("static member of B is :"+B1.x);
		System.out.println("static member of C is :"+C1.p);
		C1 s1=new C1();
		System.out.println("with class C "+s1.q);
		System.out.println("with class C "+s1.r);
		System.out.println("with class C "+s1.y);
		System.out.println("with class C "+s1.z);
		System.out.println("with class C "+s1.b);
		System.out.println("with class C "+s1.c);
		System.out.println("");
		B1 s2=new B1();
		System.out.println("with class B "+s2.y);
		System.out.println("with class B "+s2.z);
		System.out.println("with class B "+s2.b);
		System.out.println("with class B "+s2.c);
		
	}

}
