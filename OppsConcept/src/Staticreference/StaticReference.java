package Staticreference;

class Demo {
	 void display() {
		 System.out.println(" nonstatic display method of demo class");
	 }void callme(){
		 System.out.println("nonsatic callme method of demo class ");
	 }Demo(){
		 System.out.println("demo constructor");
	 }
	 }

public class StaticReference {
	 static   int age =34;
     final static Demo d1= new Demo();
     static void calling() {
   	  System.out.println("calling method of staticreferene class");
     }void test(){
   	  System.out.println("test method of staticreference class");
   	  //class.static-ref.nonstatic-method
     }public static void main(String[] args) {
   	  StaticReference.d1.display();
   	  StaticReference.d1.callme();
   	StaticReference s1=new StaticReference();
	s1.test();
	
	StaticReference.calling();
	System.out.println(StaticReference.age);
}

   	 
   	  
     }


