package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LINKED {
public static void main(String[] args) {
	LinkedHashSet ll = new LinkedHashSet();
	ll.add("harshad");
	ll.add(null);
	ll.add(null);
	ll.add("harshad");
	ll.add(222);
	ll.add(122);
	ll.add('q');
	System.out.println(ll.isEmpty());
	System.out.println(ll.size());
	System.out.println(ll);

//	ll.set(1, "geeta"); //The method set(int, String) is undefined for the type LinkedHashSet
//	- Type safety: The method set(int, Object) belongs to the raw type LinkedList. References to generic type LinkedList<E> should be 
//	 parameterized
	System.out.println(ll);
	ll.add("oooo");
	System.out.println(ll);
	ll.remove(null);
	System.out.println("----iterator---");
//Iterator it = ll.iterator();
//while(it.hasNext());
//{System.out.println(it.next());} // cANNOT use iterator to print as index is not present
System.out.println("----for each---");
for (Object p:ll)
{System.out.println(p);}






}
}
