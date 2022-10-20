package typecasting;
  class A2{
	  void test1() {
		  System.out.println("running test1");
	  }
  } class B2 extends A2{
	  void test2() {
		  System.out.println("running test2");
	  }
  } class C2 extends B2{
	  void test3() {
		  System.out.println("running test3");
	  }
  }
public class nonprimitive {
	public static void main(String[]args) {
		System.out.println("program starts");
		B2 b1= new C2();     //implicit/auto up casting ---->java complier converts into--> B2 b1 = (B2) new C2();
		b1.test1();
		b1.test2();
//		b1.test3();      //  we cannot accessed test3() by b1 reference variable 
		
		C2 c1= new C2();
		c1.test1();
		c1.test2();
		c1.test3();
		
//		*******************************************
		B2 b2= c1;   //implicit up casting --> java complier internally--> B2 b2=c1-->new C2()-->(B2)new C2();

		B2 b3 =(B2)c1; //explicit up casting---->B2 b2=(B2)new C2();
		B2 b4 =(B2)new C2();  //explicit up casting-
		b4.test1();
		b4.test2();
//		b4.test3();
//**********************************************************
		A2 a1= new C2();
		A2 a2= new B2();
		
		B2 x1= new B2();
		A2 a3=x1;
		A2 a4= (B2)x1;
		A2 a5= (B2)new B2();
		
	}
}
