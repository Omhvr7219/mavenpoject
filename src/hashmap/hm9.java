package hashmap;

import java.util.HashMap;
import java.util.Set;

import collection.hashset;

public class hm9 {
public static void main(String[] args) {
	String str="HARSHAD";
	HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
	for(int i =0;i<=str.length()-1;i++) {
		char cv = str.charAt(i);
		if(mp.containsKey(cv)) {
			mp.put(cv, mp.get(cv)+1);
			
		}
		else {
			mp.put(cv, 1);
		}
	}
	Set<Character> sv= mp.keySet();
	for(Character v :sv)
	{
		System.out.println(v +":"+ mp.get(v));
	}
	System.out.println("-------------");
	 for(Character ch :sv)
	 {
		 if(mp.get(ch)==1) {
			 System.out.println(ch+":"+ mp.get(ch));
		 }
	 }
	
}
}
