package collection;
import java.util.Vector;
public class VectorCapacityExample {

	public static void main(String[] args) {
		Vector <String> vc = new Vector <String>();
		System.out.println("to know the  vector default capacity:"+vc.capacity());
		System.out.println("to know the default size:"+vc.size());
		vc.setSize(2);
		System.out.println("again size :"+vc.size());
		System.out.println("Vector elements: "+vc);
		vc.addElement("Sunday");
		vc.addElement("Monday");
		System.out.println("updated size:"+vc.size());
		System.out.println(" again Vector elements: "+vc);
		vc.addElement("Wednesday");
		System.out.println("After addElement, Vector Size: " + vc.size());//
		System.out.println("Vector Capacity: " + vc.capacity());//
	}
		

	}


