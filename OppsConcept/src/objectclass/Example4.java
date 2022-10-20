package objectclass;
  class TestSample{
	  void callme() {
		  System.out.println("i am in the call me method");
	  }
  }
public class Example4 extends TestSample {
   static int last_roll=100;
   int rollno;
   Example4(){
	   rollno=last_roll;
	   last_roll++;
   }  @Override
   public int hashCode() {
	   return 300;
   }@Override
   public String toString() {
	   return "basic core java";
   }public static void main(String args[]) {
		Example4 s = new Example4();
		// Below two statements are equivalent
		System.out.println(s.hashCode());
		System.out.println(s);
		 TestSample t1=new TestSample();
		 System.out.println(t1);
		 System.out.println(t1.hashCode());
}
}
