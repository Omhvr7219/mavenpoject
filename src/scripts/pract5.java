package scripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.get("https://www.tradingview.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    Thread.sleep(3000);
	    driver.manage().window().minimize();
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	  
	    
	   Dimension s=new Dimension(1300,580);
	    driver.manage().window().setSize(s);
	    Thread.sleep(5000);
	    System.out.println(driver.manage().window().getSize());
	    
	    Point p =new Point(150,70);
	    driver.manage().window().setPosition(p);
	    System.out.println(driver.manage().window().getPosition());
	    
	    Thread.sleep(3000);
	    
	    
	    driver.close();
	    driver.quit();
	}

}
