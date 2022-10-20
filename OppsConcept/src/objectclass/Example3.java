package objectclass;
    class demo123{
    	void display() {
    		System.out.println("in the disolay method of demo123 class");
    	}
    }
public class Example3 extends demo123 {
      static int last_roll=100;
      int rollno;
      Example3(){
    	  rollno=last_roll;
    	  last_roll++ ; //101
    	  System.out.println(rollno);
    	  System.out.println(last_roll);
    	  } 
      @Override
      void display() {
    	  System.out.println("I am display() of class ObjectClass2");
    	  }@Override
    	    public int hashCode() {
    		  return rollno;
    	  }// Driver code
    		public static void main(String args[]) {
    			Example3 s = new Example3();
    			// Below two statements are equivalent
    			System.out.println(s);
    			System.out.println(s.toString());
    			System.out.println("hashCode() value from ObjectClass2: "+s.hashCode());//100
    			s.display();//		
    			demo123 d2=new demo123();
    			System.out.println(d2);
    			System.out.println("hashCode() value from Demo123: "+d2.hashCode());		
    		}
    	}

