package collection;

import java.util.LinkedList;
public class LinkedListExample {

	public static void main(String[] args) {
	 LinkedList <String> l1 = new LinkedList <String>();
     System.out.println("initial member of list:"+l1);
     l1.add("Ravi");
     l1.add("Vijay");
     l1.add("Ajay");
     System.out.println("after adding elements :"+l1);
     l1.add(1,"Gaurav");
     System.out.println("after adding elemnts at specific index:"+l1);
     LinkedList<String> l2 = new LinkedList<String>();
		l2.add("Sonoo");
		l2.add("Hanumat");
		// Adding second list elements to the first list
		l1.addAll(l2);
		System.out.println("After invoking addAll(Collection<? extends E> c) method: " + l1);
     LinkedList<String> l3 = new LinkedList<String>();
		l3.add("John");
		l3.add("Rahul");
		System.out.println("l3 elements:"+l3);
		l1.addAll(1,l3);
		System.out.println("after adding l3 into l1 at specific position:"+l1);
		l1.addLast("Pallavi");
		System.out.println("after adding at last:"+l1);
		l2.addFirst("Rohit");
		System.out.println("after adding at first:"+l2);
	}

}
