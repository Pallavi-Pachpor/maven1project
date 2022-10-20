package overriding1;
   class fourwheeler{
	   fourwheeler(){
		   System.out.println("parant cons");
	   } void move() {
		   System.out.println("in the parent move method");
	   }
   }
   class car extends fourwheeler {
		   car( int i){
			   System.out.println(" in the car cons");
		   } void move() {
			   System.out.println("in car move method");
		   }
	   } 
   class alto extends car{
	   alto(){
		   super(2);
		   System.out.println("in alto cons");
	   } void move() {
		   System.out.println("in alto method");
	   }
   }
   
public class overriding1 {
         public static void main(String[]args) {
        	 alto s1= new alto();
        	 s1.move();
        	 car s2=new car(8);
        	 s2.move();
         }
}
