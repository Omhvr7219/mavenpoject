package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
	HashSet h = new HashSet();// in hash set order of insertion is random ,1 null value allowed,dublicate not allowed ,datastructure is hashtable
	h.add("lx");
	h.add("po");
	h.add("12");
	h.add("15");
	h.add("18");
	h.add("20");
	h.add(22);
	h.add(22);
	h.add(null);
	h.add(null);
	h.add(null);
	System.out.println(h);
	System.out.println(h.isEmpty());
	Iterator i= h.iterator();
	while(i.hasNext())
	{System.out.println(i.next());}
	}

}
