package abstractclass;
    abstract class mn {
    	public abstract void animalsound();
    	public void sleep() {
    		System.out.println("we are in sleep method");
    	}
    } class yz extends mn{
    	 public void animalsound (){
    		 System.out.println("we are child class yz ");
    	 }
    } class xy extends mn{
    	public void animalsound() {
    		System.out.println("we are in child class xy ");
    	}
    }
public class Animal {
       public static void main(String[]args) {
    	   yz s1=new yz();
    	   s1.animalsound();
    	   s1.sleep();
       }
}
