package collection;

import java.util.ArrayList;

import com.beust.ah.A;

public class arraylist2 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
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
        System.out.println(l);
        System.out.println('\n');
        System.out.println("size of arraylist is :"+l.size());
        System.out.println(l.isEmpty());
        System.out.println(l.contains(60));
        System.out.println(l.get(6));
        l.add(8, "harshad");
        l.remove(0);
        System.out.println(l);
        System.out.println(l.get(5));
     
     
	}

}
