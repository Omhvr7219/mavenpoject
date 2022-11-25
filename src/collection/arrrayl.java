package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arrrayl {
public static void main(String[] args) {
	ArrayList ae = new ArrayList();
ae.add("hr");
ae.add("hr");
ae.add("ur");
ae.add("tr");
ae.add("pr");
ae.add(null);
ae.add(null);
System.out.println(ae);



for(Object o :ae)
	System.out.println(o);
 System.out.println("---using iterator----");
 Iterator i =ae.iterator();
 while(i.hasNext())
	 System.out.println(i.next());









	
}
}
