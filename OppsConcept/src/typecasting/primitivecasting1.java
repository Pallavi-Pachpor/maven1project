package typecasting;

public class primitivecasting1 {
	public static void main(String[] args) {
	int a=3;
	double b=a;      //java can write on behalf of me that double b= (double) b; //implicit widening
	double d= (double)a;   //explicit widening 
	System.out.println(a);
	System.out.println(b);
	System.out.println(d);
//	***********************************************************************************
	double salary=12345.6789;
	int sal=(int)salary;           //explicit narrowing
	float f=(float)salary;
	long l=(long)salary;
	System.out.println(sal);
	System.out.println(f);
	System.out.println(l);
	}
}