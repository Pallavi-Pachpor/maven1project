package Interface;
   interface Drawable2{
	   void Draw();
	   default  void msg() {
		   System.out.println("default method");
	   } static int cube(int x) {
		   return x*x*x;
	   }	 	
//	default static int print(){ // default static can't be written together
//	System.out.println("default static method of interface");
//} 
//
//private void test() {
//	System.out.println("private method");
//}
}
	   class rectangle2 implements Drawable2{
		   public void Draw() {
			   System.out.println("Draw method");
		   } 
	   }
   public class Interface8 {
	   public static void main(String args[]) {
			Drawable2 d = new rectangle2();
			d.Draw();
			d.msg();
			System.out.println(Drawable2.cube(4));  
		}
}
