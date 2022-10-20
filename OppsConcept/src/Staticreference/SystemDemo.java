package Staticreference;

public class SystemDemo {
	public static void main(String[] args) {
		//checking specific property
		System.out.println("System Dir:"+System.getProperty("user.home"));
		System.out.println("current working dir:"+System.getProperty("user.dir"));
		//clearing this property
		System.clearProperty("user.home");
		System.out.println(System.getProperty("user.home"));             //null
		// setting specific property
		System.setProperty("user.home","F:\\GitAutomation\\MorningBatch1");
		System.out.println("updated system user dir:"+System.getProperty("user.home"));
		//setting specific property
		System.setProperty("user.country","India");
		System.out.println(System.getProperty("user.country"));
	}
}
