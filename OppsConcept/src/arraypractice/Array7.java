package arraypractice;
         class Example2{
        	 int age;
        	 double salary;
        	 Example2(){
        		 System.out.println("zero parameterized");
        	 }Example2(int a){
        		 age=a;
        		 System.out.println("int parameter");
        	 }Example2(double a){
        		 salary=a;
        		 System.out.println("double parameter");
        	 }void calling(){
        		 System.out.println("calling of Example2 class age:"+age);
        		 System.out.println("calling of Example2 class salary:"+salary);
        		 
        	 }
         }
         
public class Array7 {
	public static void main(String args[]) {
		Example2 e2 = new Example2();
		Example2 e3 = new Example2(12);
		Example2 e4 = new Example2(12.34);
		e2.calling();
		e3.calling();
		e4.calling();
	System.out.println("****************************************************");	
	int empId1=101,empId2=102,impId3=103;
	int[] empId=new int[3];
	empId[0]=101;
	empId[1]=102;
	empId[2]=103;
	Example2[] e= new Example2[] {new Example2(),new Example2(13),new Example2(23.56)}; //or
	Example2[] e5= {new Example2(),new Example2(13),new Example2(23.56)};
	Example2[] e6=new Example2[3];
	e[0]= new Example2();             //e2
	e5[1]=new Example2(12);            //e3
	e6[2]=new Example2(12.12);        //e4
	e[0].calling();           //e2.calling();
	e5[1].calling();           //e3.calling();
	e6[2].calling();            //e4.calling();
	}
}
