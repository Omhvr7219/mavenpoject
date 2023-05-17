package practice;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class DEMO {
	public static void main(String[] args) {
		String name = "harshad";
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i <= name.length() - 1; i++) {
			Character cv = name.charAt(i);
			if (mp.containsKey(cv)) {
				mp.put(cv, mp.get(cv) + 1);
			} else {
				mp.put(cv, 1);
		}
		}
//		Set<String> ltr = mp.keySet();
//	
//		for (Character lr : ltr) {
//			System.out.println(lr + ";" + mp.get(lr));
//		}

	}

}
