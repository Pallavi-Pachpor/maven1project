package objectclass;
       class A {
    	   int age=12;
    	   static int empid=3456;
    	   @Override
    	  public String toString() {
    		   return "i am tostring method";
    	   }
    	   @Override
    	   public int hashCode() {
    		   return age;
    	   }
       }
       
public class Example7 extends A {

      Example7(){
    	int  rollno=100;
    	  int lastroll=rollno;
    	  rollno++;
      }   public static void main(String args[]) {
    	 Example7 e1= new Example7();
    	 System.out.println(e1);
    	 System.out.println(e1.toString());
    	 System.out.println(e1.hashCode());
    	  A e2= new Example7();
    	  System.out.println(e2);
     	 System.out.println(e2.toString());
     	 System.out.println(e2.hashCode());
         System.out.println("**************************************************");
         Example7 e3=new Example7();
         System.out.println(e2.equals(e3));
         Example7 e4=e3;
         System.out.println(e3.equals(e4));
      }
      
}
  