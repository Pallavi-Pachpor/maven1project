package collection;
import java.util.ArrayList;
public class Example5 {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		System.out.println("initial size od al1:"+al1.size());
		System.out.println("initial list of elements:"+al1);
		System.out.println("list of elements status:"+al1.isEmpty());//if it is empty it will return true
		al1.add("Ravi");
		al1.add("Vijay");
		al1.add("Ajay");
		System.out.println("after invoking add(E,e)method:"+al1);
		al1.add(1,"Gaurav");
		System.out.println("after invoking add (index int,E):"+al1);
		ArrayList al2 = new ArrayList();
		al2.add("sonoo");
		al2.add("hanumat");
		System.out.println("elements of al2:"+al2);
		al1.addAll(al2);// Adding second list elements to the first list
		System.out.println("after adding al2 elements in the al1:"+al1);
		ArrayList al3 = new ArrayList();
		al3.add("John");
		al3.add("Rahul");
		System.out.println("elements of al3:"+al3);  
		al2.add(1,al3);// Adding second list elements to the first list at specific position
		System.out.println("after adding al3 elements in al2 at index no 1:"+al2);
        System.out.println(al2.get(0));		

	}

}
