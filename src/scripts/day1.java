package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();// upcasting operation
	driver.get("https://web.whatsapp.com/"); // to open url
	
	
	String str=driver.getCurrentUrl(); // get url
	System.out.println(str);
	String stri= driver.getTitle();  // get title of url
	System.out.println(stri);
	Thread.sleep(10000);    // for wait
	driver.close();        // to close current tab
	driver.quit();       // to close all tab or browser
	 
	
	
}
}
