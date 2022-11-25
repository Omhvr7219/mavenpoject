package scripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prc1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	driver.getTitle();
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.manage().window().maximize();
//	driver.manage().window().minimize();
//	driver.manage().window().getPosition();
//	driver.manage().window().getSize();
//	System.out.println(driver.manage().window().getSize());
	System.out.println(	driver.manage().window().getPosition());
	Point p = new Point(-10,-10);
	Thread.sleep(3000);
	driver.manage().window().setPosition(p);
	Thread.sleep(3000);
//	driver.manage().window().getPosition();
//	driver.manage().window().getSize();
//	System.out.println(driver.manage().window().getSize());
//	System.out.println(	driver.manage().window().getPosition());
	Dimension d = new Dimension(700,1400);
	driver.manage().window().setSize(d);
	Thread.sleep(3000);
	driver.navigate().to("https://www.google.com");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
//	driver.close();
//	driver.quit();
	
}
}
