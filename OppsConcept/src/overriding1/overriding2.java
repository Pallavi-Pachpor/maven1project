package overriding1;
  class animal1{
	  animal1(){
		  System.out.println(" parent constructor");
	  } void display() {
		  System.out.println("in animal display method");
	  } void move() {
		  System.out.println(" in the animal move method");
	  }
  } class dog extends animal1{
	  void display() {
		  System.out.println(" in dog display method");
		super. move();
	  }
  }
public class overriding2 {
      public static void main(String[]args) {
    	  animal1 s1= new animal1();
    	  s1.move();
    	  s1.display();
    	  dog s2= new dog ();
    	  s2.display();
    	  
      }
}
