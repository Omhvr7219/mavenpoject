package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arl3 {
public static void main(String[] args) {
	ArrayList l=new ArrayList();
	l.add("geeta");
	l.add("gauri");
	l.add("tejal");
	l.add("sonal");
	l.add("prajakta");
	l.add("shital");
	l.add("null");
	l.add("null");
	l.add('R');
	System.out.println(l);
	System.out.println(l.size());
	l.set(0, "geeta randive");
	System.out.println(l);
	l.remove(8);
	System.out.println(l);
	System.out.println(l.isEmpty());
	l.add(8, "chinmayee");
	System.out.println(l);
	System.out.println(l.get(3));
	System.out.println(l.contains("gauri"));
	
	
	for(int i=0;i<=l.size()-1;i++)
		
		System.out.println(l.get(i));
	System.out.println('\n');
	
	System.out.println("-------by for each-----");
	for(Object o:l)
		System.out.println(o);
	System.out.println("---by listiterator----");
	ListIterator itr= l.listIterator();
	while(itr.hasNext())
	{	System.out.println(itr.next());}
	System.out.println("----by iteraotor----");
	Iterator it= l.iterator();
	while(it.hasNext())
		System.out.println(it.next());
	
	
}
}
