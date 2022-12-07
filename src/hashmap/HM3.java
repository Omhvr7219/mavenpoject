package hashmap;

import java.util.HashMap;
import java.util.Set;

public class HM3 {
	public static void main(String[] args) {
		String str = "SATURDAY";
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i <= str.length()-1; i++) {
			char ctr = str.charAt(i);
			if (mp.containsKey(ctr)) {
				mp.put(ctr, mp.get(ctr) + 1);
			} else {
				mp.put(ctr, 1);
			}
		}

		Set<Character> ctrs = mp.keySet();
		for (Character c : ctrs) {
			System.out.println(c + ":" + mp.get(c));
		}
		for (Character c : ctrs) {
			if (mp.get(c)==1)
			System.out.println(c);
		}
System.out.println("A  :"+ mp.get('A'));
	}
}
