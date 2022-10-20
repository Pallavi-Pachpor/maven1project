package Interface;
    interface Animal12{
    	int age=12;
    	void print ();
    	void show();
    }
    interface reptiles{
    	void display();
    } 
    class pig12 implements Animal12{
    	public void print() {
    		System.out.println("print method");
    	} public void show() {
    		System.out.println("show method");
    	}
    } class dog12 extends pig12 implements reptiles{
    	public void display() {
    		System.out.println("display method");
    	} public void print() {
    		System.out.println("print method in class dog12");
    	}
    }
public class Interface7 {
	public static void main(String[] args) {
		dog12 s1= new dog12();
		s1.print();
		s1.display();
		s1.show();
		pig12 s2= new pig12();
		s2.print();
		s2.show();
//		s2.display();     it does not call as it is not present in pig class 
		
	}
}
