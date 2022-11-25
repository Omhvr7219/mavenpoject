package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arlprc1 {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add("harshad");
	al.add("geeta");
	al.add("null");
	al.add("harshad");
	al.add("hari");
	al.add("raut");
	al.add("randive");
	System.out.println(al);
	al.remove(2);
	System.out.println(al);
	al.set(1, "hrx");
	System.out.println(al);
	Iterator itr= al.iterator();
	System.out.println("---------------by iterator");
	while(itr.hasNext())
	{System.out.println(itr.next());}
	System.out.println("----------------by FOREACH");
	for(Object o:al)
	{
		System.out.println(o);
	}
	System.out.println("----------------by listiterator");
	ListIterator ltr =al.listIterator();
	while(ltr.hasNext())
		
	{
		System.out.println(ltr.next());
	}
	System.out.println("----------------by forloop");
	for(int i =0;i<=al.size()-1;i++)
	{
		System.out.println(al.get(i));
	}
	
}
}
