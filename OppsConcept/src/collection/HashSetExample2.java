package collection;
import java.util.HashSet;
import java.util.Iterator;
 //import javax.swing.plaf.synth.SynthSeparatorUI;                                 ask the meaning ?
public class HashSetExample2 {

	public static void main(String[] args) {
		HashSet <String> list =new HashSet <String> ();
		list.add("Ravi" );
		list.add("Vijay");
		list.add("Ajay");
		list.add("Ravi");
		System.out.println("List elements: "+list);
        HashSet <String> set = new HashSet <String> (list);
        System.out.println("initial elements set:"+set);
        set.add("Gaurav");
		System.out.println("set elements: "+set);
		Iterator <String> p = set.iterator();
		while (p.hasNext()) {
			System.out.println(p.next());
		}
		System.out.println("**************************");
		set.forEach(str ->{
			System.out.println(str);
		});
   set.removeIf(R -> R.contains("Ravi"));
   System.out.println("after cheking condition:"+set);
	}

}
