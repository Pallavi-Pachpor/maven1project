package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Example7 {

	public static void main(String[] args) {
		 ArrayList  <String> al = new ArrayList<String>();
		 System.out.println("is it empty or not:"+al.isEmpty());
		 al.add("Ravi");
		 al.add("Vijay");
		 al.add("Ajay");
	    al.add("Hanumat");
	    ArrayList <String>al2 = new ArrayList<String>();
	    al2.add("Ravi");
		al2.add("Hanumat");
		al2.add(new String( "Pune"));
		System.out.println("list of al elements:"+al);
		System.out.println("list of al2 elements:"+al2);
       al.retainAll(al2);
       System.out.println("al list after retainAll():"+al);  //common name will print
       System.out.println("iterating the elements after retaining the elements of al2");
       Iterator itr = al.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
       List l1=new ArrayList();
		l1.add("Pune");
		l1.add("Pune");
		l1.add(123);
		l1.add("Pune");
		l1.add(null);
		System.out.println(l1);
	}

	}


