package systemclass;

public class Example1 {
 public static void main(String[]aegs) {
	 System.out.println(System.getProperty("user.home"));  //to check specific property
	 System.out.println(System.getProperty("user.dir"));   //to check current directory
	 System.clearProperty("user.home");                    //to clear the property
	 System.out.println(System.getProperty("user.home"));  //it will shows the null
	 System.setProperty("user.home","INDIA");                //to set the property
	 System.out.println(System.getProperty("user.home"));   
	 System.out.println("other than system property:"+System.getProperty("user.password","none of your business"));
	 System.out.println("difference between the current time and midnight,september 2,2022,UTC is:"+System.currentTimeMillis());
	 System.out.println(System.nanoTime());
	 System.out.println(System.getProperty("java.home"));
  }
}
