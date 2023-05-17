package practice;

import java.util.HashMap;
import java.util.Set;

public class fbfb {
	public static void main(String[] args) {
		String str = "abcaba";
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i <= str.length() - 1; i++) {
			Character cv = str.charAt(i);
			if (mp.containsKey(cv)) {
				mp.put(cv, mp.get(cv) + 1);
			} else 
			{
				mp.put(cv, 1);
			}

		}
		Set<Character> nm = mp.keySet();

		for (Character mm : nm) {
			System.out.println(mm + ":"+mp.get(mm));
		}

	}
}
