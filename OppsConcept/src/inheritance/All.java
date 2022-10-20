package inheritance;

class company{ 
	int empid=345;
    double salary=1234;
	
	public void method1() {
		System.out.println("we are in method 1 ");
	}public void method1(int a) {
		int empid=123;
		System.out.println(" local empid is :"+empid);
		System.out.println("global empid is :"+this.empid);
	}company(){
		System.out.println("we are in company constructor");
	}company (int empid){
		empid=678;
		salary=1234;
		System.out.println("empid in company constructoris :"+empid);
		System.out.println("salary in company constructor is :"+salary);
		
	}
} class employee extends company{
	int empid=13;
	double salary=3456;
	employee(){
		super();
	
		System.out.println("we are in employee class constructor1");
		System.out.println("empid in empoyee class and in cons 1 is :"+empid);
		System.out.println("salary in empoyee class and in cons 1 is :"+salary);
		System.out.println("empid in empoyee class and in cons 1 is :"+this.empid);
		System.out.println("salary in empoyee class and in cons 1 is :"+this.salary);
		
	}employee(int b){
		super();
		System.out.println("we are in employee class constructor 2");
		System.out.println("empid in empoyee class and in cons 2 is :"+empid);
		System.out.println("salary in empoyee class and in cons 2 is :"+salary);
		System.out.println("empid in empoyee class and in cons 2 is :"+this.empid);
		System.out.println("salary in empoyee class and in cons 2 is :"+this.salary);
		
	}void method3(){
	
		System.out.println("we are in method 3");
		System.out.println("empid in empoyee class and in method3 is :"+empid);
		System.out.println("salary in empoyee class and in method3 is :"+salary);
		System.out.println("empid in empoyee class and in methhod3 is :"+this.empid);
		System.out.println("salary in empoyee class and in method3 is :"+this.salary);
		
		
		
	}void method3(int c){
		method3();
		
	}
}
public class All{

	public static void main(String[]args) {
		employee s1=new employee();
		s1.method3(3);
		s1.method1();
		s1.method1(2);

}
}
