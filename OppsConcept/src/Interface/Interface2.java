package Interface;
       interface bank{
    	   float roi();
       } class sbi implements bank {
    	   public float roi() {
    		   return 9.8f;
    	   }
       } class pnb implements bank{
    	   public float roi() {
    		   return 4.5f;
    	   }
       }
public class Interface2 {
      public static void main(String[]args) {
    	  sbi s1=new sbi ();
    	  System.out.println("sbi roi :"+s1.roi());
    	  pnb s2= new pnb ();
    	  System.out.println("pnb roi :"+s2.roi());
    	  bank s3= new pnb();
    	  System.out.println(s3.roi());
    	  bank s4= new sbi();
    	  System.out.println(s4.roi());
      }
}
