package collection;
 import java.util.Collections;
import java.util.ArrayList;
 import java.util.Iterator;

public class Example3 {

	
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
     obj.add("Mango");
     obj.add("Apple");
     obj.add("Banana");
     obj.add(123);
     System.out.println("size of the obj list is:"+obj.size());
     System.out.println("elements of the obj are:"+obj);
     for (int i=0; i<obj.size();i++) {
    	 System.out.println(obj.get(i));
     }for (Object p:obj) {
    	 System.out.println(p);
     }obj.set(1,"Dates");
     System.out.println("updated size:"+obj.size());
     System.out.println("updated elements are:"+obj);
     Collections.sort(obj);
     System.out.println("again updated size:"+obj.size());
     System.out.println("again updated elements:"+obj);

		System.out.println("Traversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
   obj.forEach(a ->{// Here, we are using lambda expression
    	System.out.println(a);
    });
    System.out.println("Traversing list through Iterator interface:");
    Iterator itr1 = obj.iterator();
    while(itr1.hasNext()) {
	System.out.println(itr1.next());
	}System.out.println(itr1.next());
	System.out.println("*********with used Iterator Object**********");
	 while(itr1.hasNext()) {
			System.out.println(itr1.next());
			}	System.out.println("*******with new Iterator Object************");
			Iterator itr3 = obj.iterator();
			while(itr3.hasNext()) {
				System.out.println(itr3.next());
			}
		}
		}
	


