package hashmap;

import java.util.HashMap;
import java.util.Set;

public class hashmap1 {
	public static void main(String[] args) {
		String Str = "abcaba";
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i <= Str.length() - 1; i++) {
			char charvalue = Str.charAt(i);
			// System.out.println(mp.get('a'));
			if (mp.containsKey(charvalue)) {
				mp.put(charvalue, mp.get(charvalue) + 1);
			} else {
				mp.put(charvalue, 1);
			}

		}
		Set<Character> keys = mp.keySet();//[a,b,c]
		// print occurance of each Character
		for (Character key : keys)
			System.out.println(key + ":" + mp.get(key));
		System.out.println("----------------------------");
		// to print only duplicate element

		for (Character key : keys) {
			if (mp.get(key) >1) {
				System.out.println(key + ": " + mp.get(key));
			}
		}
		System.out.println("----------------------------");

		System.out.println("a: " + mp.get('a'));
		System.out.println("d: " + mp.get('d'));

	}
}
