package collection;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class vector2 {public static void main(String[] args) {
	Vector v = new Vector();
	v.add("hr");
	v.add("hrv");
	v.add("geeta");
	v.add("hari");
	v.add("hero");
	v.add("gauri");
	v.add("aakash");
	v.add("1");
	System.out.println(v);
	v.set(0, "htrfgg");
	System.out.println(v);
	v.remove(1);
	System.out.println(v);
	v.get(5);
	System.out.println(v.get(5));
	v.set(6, "om");
	System.out.println(v);
	System.out.println("---------print by enumeration---------");
	Enumeration e=v.elements();
	while(e.hasMoreElements())
	{System.out.println(e.nextElement());}
	System.out.println("---------print by listiterator---------");
	ListIterator lr= v.listIterator();
	while(lr.hasNext())
	{	System.out.println(lr.next());}
	System.out.println("---for each---");
	for(Object eC:v)
		System.out.println(eC);
	
	
	
	
}

}
