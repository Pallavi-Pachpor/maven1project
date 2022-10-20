package collection;
 import java.util.ArrayList;

public class Example6 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");
		System.out.println("initial elements of al:"+al);
		System.out.println("to remove the elements from al:"+al.remove("Vijay"));//to remove the element
		System.out.println("after removing the element:"+al);
		System.out.println("want to remove element from specific position:"+al.remove(0));//it will show ravi
		System.out.println("after removing from specific position:"+al);
		ArrayList<String> al2 = new ArrayList();
		al2.add("Ravi");
		al2.add("Hanumat");
		System.out.println("elements of al2:"+al2);
		al.addAll(al2);
		System.out.println("after adding al2 into al:"+al);
		al.removeAll(al2);// Removing all the new elements from arraylist
		System.out.println("after removing al2 from al:"+al);
		// Removing elements on the basis of specified condition
		if(al.contains("Ajay")) {
			System.out.println(al.remove("Ajay"));
		}
		System.out.println("After using condition:"+al);
		al.removeIf( str -> str.contains("Ajay")); // Here, we are using Lambda expression
			System.out.println("al list members after using if condition by lambda epression :"+al);
		
        al.clear();// Removing all the elements available in the list
        System.out.println("after cleaning :"+al);
	}

}
