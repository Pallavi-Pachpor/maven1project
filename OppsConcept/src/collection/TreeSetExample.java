package collection;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet <String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		System.out.println("treeset elements are:"+al);
		System.out.println("Traversing element through Iterator in descending order");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}System.out.println("Traversing element through Iterator in descending order");
		Iterator i = al.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(24);
		set.add(66);
		set.add(12);
		set.add(15);
		System.out.println("size of treeset:"+set.size());
		System.out.println("elements of set:"+set);
		System.out.println("first element value :"+set.pollFirst());
		System.out.println("after pollFirst() elements are:"+set);

		System.out.println("last element Value: " + set.pollLast());
		System.out.println("After pollLast(), TreeSet elements are: "+set);
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("A");
		set2.add("B");
		set2.add("C");
		set2.add("D");
		set2.add("E");
		System.out.println("Initial Set: " + set2);
		System.out.println("reverse set2:"+set2.descendingSet());
		System.out.println("headset use:"+set2.headSet("C"));
		System.out.println("Head Set: " + set2.headSet("C", true));//abc
		System.out.println("by using subse:"+set2.subSet("A","E"));
		System.out.println("BY USING SUBSET BUT INCLUDING BOOLEAN "+set2.subSet("A",false,"E",true));
		System.out.println("by using tailset:"+set2.tailSet("D"));
		System.out.println("by using tailset by boolean:"+set2.tailSet("C",true));
		
		

	}

}
