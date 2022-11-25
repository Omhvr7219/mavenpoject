package scripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract6 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.get("https://meet.google.com/?authuser=0");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	System.out.println(driver.manage().window().getSize());
	System.out.println(driver.manage().window().getPosition());
	Point p =new Point(200,120); 
	driver.manage().window().setPosition(p);
	Thread.sleep(5000);
	Dimension d = new Dimension(1500,800);
	driver.manage().window().setSize(d);
	System.out.println(driver.manage().window().getPosition());
	System.out.println(driver.manage().window().getSize());
	Thread.sleep(5000);
	driver.close();
	
}
}
