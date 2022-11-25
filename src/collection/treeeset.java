package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class treeeset {
public static void main(String[] args) {
	TreeSet t = new TreeSet();
	t.add("21");
	t.add("333");
	t.add("252");
	t.add("201");
	t.add("661");
	t.add("901");
	t.add("201");
	t.add("2");
	System.out.println(t);
	System.out.println(t.size());
	System.out.println(t.isEmpty());
	System.out.println("----for each---");
     for (Object o:t)	
	 System.out.println(o);
	System.out.println("-----itrator---");
Iterator u= t.iterator();
while(u.hasNext())
	System.out.println(u.next());


	
	
}
}
