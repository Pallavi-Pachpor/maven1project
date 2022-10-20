package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set <String> s1 = new HashSet <String> ();  //create the object
		s1.add("Ravi");
		s1.add("Vijay");
		s1.add("Ravi"); //simply it will neglect the ravi as it is duplicate
		s1.add("Ajay");
		System.out.println("members of s1 set are :"+s1);
		System.out.println("size of the s1 set is :"+s1.size());
		System.out.println("to print it with the iterator");
		Iterator <String> itr = s1. iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("to remove ravi from s1 set:"+s1.remove("Ravi"));
		System.out.println("after removing the ravi:"+s1);
		HashSet <String> set1 = new HashSet <String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		System.out.println("set1 elements are:"+set1);
		// to add the set1 elements into the s1
		s1.addAll(set1);
		System.out.println("after adding set1 into the s1:"+s1);
		s1.removeAll(set1);//remove all set1 elemnts
		System.out.println("after removing set1 from s1:"+s1);
		s1.removeIf(p -> p. contains("Vijay"));
			System.out.println("if vijay is present then remove it:"+s1);
			set1.removeIf( r -> r.contains("Ajay"));
			System.out.println("after checking for set1:"+set1);
			set1.clear();
			System.out.println("after clear:"+set1);
			
		}
		

	}


