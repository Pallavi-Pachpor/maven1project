package inheritance;

 class A {
	 public static void main(String[]args) {
		 System.out.println("static member of B is:"+B.x);
			System.out.println("static member of C is :"+C.p);
			System.out.println("static member of D is :"+D.a);
			B s1=new B();
			System.out.println("nonstatic member of B are :"+s1.y+"and"+s1.z);
			C s2=new C();
			System.out.println("nonstatic member of C are:"+s2.q +"and"+s2.r);
			D s3 = new D ();
			System.out.println("nonstatic member of D are :"+s3.b +"and "+s3.c);
		}

}class B{
	static int x=34;
	int y=67;
	double z=34.56;
}class C{
	static int p=89;
	int q=25;
	double r=36.78;
}
  class D {
	  static int a=23;
		int b=78;
		double c=99.09;

		
	}

