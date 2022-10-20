package collection;

import java.util.ArrayList;
import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		List list = new ArrayList();  // Creating arraylist - default size is 10     
		list.add("Mango");// auto-upcasting from String to Object class object
		list.add(1235);// first boxing for int to Integer class object---> upcasting to object class
		list.add("Banana");// auto-upcasting from String object to Object class object
		list.add(null);
		list.add('c');// first boxing for char to Character class object---> upcasting to object class
		list.add(325.36);// first boxing for double to Double class object---> upcasting to object class
		list.add(true);// first boxing for boolean to Boolean class object---> upcasting to object class
		list.add("Banana");//duplicate
		list.add(new Example2());
		System.out.println("size of the arraylist:"+list.size());
		System.out.println("elements of the list:"+list);
		System.out.println("transvering list through the loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
			System.out.println("Traversing list through for-each loop:");
			// Traversing list through for-each loop
			for (Object fruit : list) {
				System.out.println(fruit);
				// accessing the element 
				System.out.println("accessing the elements of index what we want:"+list.get(1));// it will return the 2nd element, because index starts from zero
				// changing/update existing object
				list.set(1,"Dates");
				System.out.println("again size of arraylist:"+list.size());
				System.out.println("updated elements of list are:"+list);
			}
		}

	}


