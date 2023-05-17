package hashmap;

import java.util.HashMap;
import java.util.Set;

public class hm7 {
	public static void main(String[] args) {
		String str = "abcabadc";
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i <= str.length() - 1; i++) {

			char cv = str.charAt(i);
			if (mp.containsKey(cv)) {
				mp.put(cv, mp.get(cv) + 1);
			} else {
				mp.put(cv, 1);
			}

		}
		
		Set<Character> keys = mp.keySet();
		
		for(Character key :keys) {
			System.out.println(key+":"+mp.get(key));
		}
		System.out.println("--------------");
for(Character key :keys) {
	if(mp.get(key)<=1) {
		System.out.println(key+":"+mp.get(key));
	}
}
	}
}
