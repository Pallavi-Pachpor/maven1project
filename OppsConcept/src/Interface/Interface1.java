package Interface;
      interface drawable{
    	  int salary=67890;
    	  void print(); 
      }
      class rectangle implements drawable{
    	public  void print() {
    		  System.out.println("we are in print method");
    	  }
      } class circle implements drawable{
    	  public void print() {
    		  System.out.println("we are in circle class print method");
    	  }
      }
public class Interface1 {
        public static void main (String[]args) {
        	System.out.println("interface variable salary :"+ drawable.salary);
        	rectangle s1=new rectangle();
        	s1.print();
        	circle s2= new circle();
        	s2.print();
        	drawable s3= new circle();
        	s3.print();
        	
        }
}
