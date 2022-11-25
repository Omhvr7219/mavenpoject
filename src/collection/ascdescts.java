package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ascdescts {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://mahadbtmahait.gov.in/Grievance/Grievance");
		Thread.sleep(2000);
	    WebElement hr = driver.findElement(By.id("DistrictID"));
	
	    Select SL = new Select (hr);
	    SL.selectByIndex(3);
	    Thread.sleep(2000);
		WebElement tal=driver.findElement(By.id("TalukaID"));
		Select tl = new Select (tal);
		List<WebElement> list = tl.getOptions();
		for(WebElement n:list)
		System.out.println(n.getText());
		System.out.println("-----by ascending order using treeset-----");
		TreeSet tr = new TreeSet();
		// to add data to treeset
		for(WebElement asc:list) 
		{
			tr.add(asc.getText());
		}
		
		// to fetch/get data in asc order
		for (Object s:tr)
		{
			System.out.println(s);
		}
		
		System.out.println("-----by DEScending order using treeset-----");
		
		
		Iterator <String> i = tr.descendingIterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println("-----by random order using hashset -----");
		HashSet hs = new HashSet();
//		add data to hashset
		for (WebElement d:list)
		{
			hs.add(d.getText());
		}
		//to fetch random data
		for (Object to:hs)
		{
		System.out.println(to);
		}
	}}


