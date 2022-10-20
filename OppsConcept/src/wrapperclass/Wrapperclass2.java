package wrapperclass;

public class Wrapperclass2 {
	public static void main(String[]args){
		  Double obj1 = 123.45;
		  Double obj2 = new Double (234.56);
		  System.out.println("value of obj1 is:"+obj1);
		  System.out.println(obj2);
		  System.out.println("value of obj2 is :"+obj2);
		  double uw = obj1.doubleValue();
		  System.out.println("value of salary is :"+uw);
		  System.out.println(uw==obj1);
		  double salary= obj2.doubleValue();
		  System.out.println("value od salary is :"+salary);
		  System.out.println(salary==obj1);
		  
}
}
