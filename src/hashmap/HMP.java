package hashmap;

import java.util.HashMap;
import java.util.Set;
public class HMP {
public static void main(String []args) {
	
	String name = "harshad";
	
	HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
	for(int i=0;i<=name.length()-1;i++) {
		Character cv =name.charAt(i);
		if(mp.containsKey(cv)) {
			mp.put(cv, mp.get(cv)+1);
		}else {
			mp.put(cv, 1);
		}
	}
	
	Set <Character> keys = mp.keySet();   //[a,b,c]
	// print occurance of each Character
	for (Character key : keys)
		System.out.println(key + ":" + mp.get(key));
	
	
}
}
