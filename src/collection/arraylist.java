package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
	a.add("harshad");
	a.add("Lakhan");
	a.add("rahul");
	a.add("nilesh");
	a.add("trimurti");
	a.add("anand");
	a.add("harshad");
	System.out.println(a);
	System.out.println(a.indexOf("nilesh"));
	System.out.println(a.lastIndexOf("harshad"));
	System.out.println("---------PRINT INFO BY USING FOR LOOP-------");
	for(int i=0;i<=a.size()-1;i++)
		{
		System.out.println(a.get(i));
		}
	System.out.println("------PRINT INFO BY USING ITERATOR----------");
	Iterator itr=a.iterator();
	while (itr.hasNext()) // to check info is present 
	{
		System.out.println(itr.next());
	}
	System.out.println("------PRINT INFO BY USING list ITERATOR----------");
	
      ListIterator	itr1=a.listIterator();
      while (itr1.hasNext())
      {
    	  System.out.println(itr1.next());
      }
	
      System.out.println("------PRINT INFO BY USING for each loop----------");
      for(Object o:a)
      { System.out.println(o);
	
      }
	
		}
	
	
	
	
	
	}


