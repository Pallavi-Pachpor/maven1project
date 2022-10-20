package collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueExample {
	public static void main(String[] args) {
	 Queue<Integer> n1 = new PriorityQueue <Integer> ();
	 n1.add(213);
	 n1.add(123);
	 n1.add(289);
	 n1.add(21);
	 n1.add(11);
	 n1.add(1);
	 System.out.println("size of queue:"+n1.size());
	// while adding element in Queue, it will always keep smallest element on the top
	 System.out.println("elemnts of queue:"+n1);
	 //element() returns top most element of the queue, if the queue if empty dn it
	 //will throw an exception by name 'NoSuchElementException'
	 System.out.println("top element with using element() :"+n1.element());
	// peek() returns top most element of the queue, if the queue if empty dn it
			// will return 'null' instead of throwing exception
	 System.out.println("tp element with help of peek() :"+n1.peek());

		System.out.println("iterating the queue elements using for-each loop:");
		for(Object p : n1) {
			System.out.print(p+" ");
		}
		System.out.println("iterating the queue elements using Iterator:");
		Iterator itr = n1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}System.out.println("*********************************");
		System.out.println("queue elements are:"+n1);
		// it will remove top most element of the Queue, if the queue is empty dn it
				// will throw an exception by name 'NoSuchElementException'
		System.out.println("by using remove() method:"+n1.remove()); //it will show only 1 as output that is first element
		// it will remove top most element of the Queue, if the queue is empty dn it
				// will return 'null' value
		System.out.println("by using poll():"+n1.poll()); //it will show 11
		System.out.println("queue elements are:"+n1);
		Iterator itr2 = n1.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("*********************");
		// using lamda expression
	 	n1.forEach(p1 -> {
			System.out.println(p1);
		});
		
	 
	 

	}
}


