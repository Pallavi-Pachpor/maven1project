package abstractclass;
    abstract class bike1{
    	abstract void run();
    	void speed (int i) {
    		System.out.println("speed is :"+i);
    	}
    }  class honda extends bike1{
    	void run (){
    		System.out.println("we are in run method of honda class");
    		super.speed(56);
    		}void colour(){
    			System.out.println("colour method");
    			super.speed(45);
    		}
    }
public class Abstractclass1 {
    public static void main(String[]args) {
    	honda s1= new honda();
    	s1.run();
    	s1.speed(79);
    	s1.colour();
    }
}
