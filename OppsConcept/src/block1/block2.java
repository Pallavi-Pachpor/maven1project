package block1;

public class block2 {
       static   int age;
          int rollno;
        
          public static void main(String[]args) {
        	  System.out.println("hello program");
        	  block2 s1=new block2();
        	  s1.print();
        	  
          }static {
        	  System.out.println("static block 1");
        	  age=67;
          }  {
        	  System.out.println("nonstatic block 2");
        	//  age=12;
        	  rollno=45;
        	   
          }   void print () {
        	  System.out.println(age);
        	  System.out.println(rollno);
          }
        
   }

