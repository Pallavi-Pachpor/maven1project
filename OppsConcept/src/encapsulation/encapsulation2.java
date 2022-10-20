package encapsulation;
     class demo{
    	 private int a=12;
    	 private int b=45;
    	 private int c;
    	public int addition() {                         //getter method
    		 c=a+b;
    	//	 System.out.println(c);
    		 
    		 return c;
    	 } public int run(){                            //getter method
    		 c= a-b;
    		 System.out.println(c);
    		 return c;
    	 } public void print(int a,int b){                 //setter method
    		 this.a=a;
    		 this.b=b;

    		  }
 
     }
public class encapsulation2 {
	public static void main (String[]args){
      demo s1= new demo();
      System.out.println(s1.addition());
     s1.run();
      s1.print(12, 13);
      s1.addition();
      s1.run();
      System.out.println(s1.addition());
    System.out.println(s1.run());
  
}
}
