package inheritance;
     
class q {
	q(){
		System.out.println("fruit class cons..");
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
// child class of fruit
class w extends q {
	w(){
		//super(); //java compiler will write default super()
		System.out.println("Apple class Cons..");
	}
	public void shape() {
		System.out.println("Apple is round");
	}
}
public class A12 {
	public static void main(String[] args) {
		w fr = new w(); // object of child class
		fr.taste(); // call method of parent class
		fr.shape(); // call method of child class
	}
}
