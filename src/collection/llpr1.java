package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class llpr1 {
public static void main(String[] args) {
	LinkedList ll= new LinkedList();
	ll.add("vilol");
	ll.add("rajesh");
	ll.add("hr");
	ll.add("sunil");
	ll.add("rajesh");
	ll.add("null");
	System.out.println("----bylistiteraor-------");
	ListIterator lll=ll.listIterator();
	while(lll.hasNext())
	{
		System.out.println(lll.next());
	}
	
	System.out.println("----by for loop-------");
	for(int i =0;i<=ll.size()-1;i++)
	{
		System.out.println(ll.get(i));
	}
	System.out.println("----by for eaCH-------");
	for(Object o:ll)
	{
		System.out.println(o);
	}
	
}
}
