package collection;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class vector {
public static void main(String[] args) {
	Vector l=new Vector();
	l.add(55);
	l.add(56);
	l.add(57);
	l.add(58);
	l.add(59);
	l.add(60);
	l.add(61);
	l.add(62);
	l.add(null);
    l.add("A");
  
    System.out.println("---by listiterator----");
    ListIterator li=l.listIterator();
    while(li.hasNext())
    {System.out.println(li.next());}
    System.out.println("---by enumerator----");
    Enumeration el=l.elements();
   while(el.hasMoreElements())
    System.out.println(el.nextElement());
    
}
}
