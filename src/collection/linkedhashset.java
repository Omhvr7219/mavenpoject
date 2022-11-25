package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashset {
public static void main(String[] args) {
LinkedHashSet h = new LinkedHashSet();// in LinkedHashSet set order of insertion is MAINTAIN ,1 null value allowed,dublicate not allowed ,datastructure is HYBRID
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
	h.remove("15");
	
	System.out.println(h);
	System.out.println(h.isEmpty());
//	System.out.println("------iterator----");
////	Iterator i= h.iterator();
////	while(i.hasNext());
////	{System.out.println(i.next());}
//	
	for (Object o:h)
	{	System.out.println(o);}
	
//	}
}}

