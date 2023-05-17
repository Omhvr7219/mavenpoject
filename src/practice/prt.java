package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prt {
	public static void main(String[] args) throws InterruptedException {
		String votes[] = { "john", "johnny", "jackie", "john", "john", "jackie", "jamie", "jamie", "john", "johnny",
				"jamie", "johnny", "john" };
		HashMap<String, Integer> mp = new HashMap<String, Integer>();
		for (int i = 0; i <= votes.length - 1; i++) {
			String name = votes[i];
			if (mp.containsKey(name)) {
				mp.put(name, mp.get(name) + 1);
			} else
				mp.put(name, 1);
		}
		Set<String> value = mp.keySet();
		for (String sv : value) {
			System.out.println(sv +";"+mp.get(sv));
			
			System.out.println(mp.get(sv));
		}
System.out.println(mp);
	}

}
