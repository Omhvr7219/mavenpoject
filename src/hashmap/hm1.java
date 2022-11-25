package hashmap;

import java.util.HashMap;
import java.util.Set;

public class hm1 {
public static void main(String[] args) {
	String str ="ababdcdcghteytetyertd";
	HashMap<Character,Integer> mp =new HashMap<Character,Integer>();
	for(int i=0;i<=str.length()-1;i++)
	{
		char cr= str.charAt(i);
		if(mp.containsKey(cr)) {
			mp.put(cr, mp.get(cr)+1);
		}
		else {mp.put(cr, 1);
			
			
		}
	}
	
	Set<Character> val =mp.keySet();
	for(Character keys:val)
	{ if (mp.get(keys)==1) {
		System.out.println(keys+":"+ mp.get(keys));
	}
	
	}
}
}
