package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upstoxtestclass {public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//go to upstox URL
	driver.get("https://login-v2.upstox.com/");
	
	
	
	upstoxp1pom o1 = new upstoxp1pom(driver);
	o1.enterUN();
	o1.enterPW();
	o1.click();
	upstoxp2pom o2= new upstoxp2pom (driver);
	Thread.sleep(2000);
	o2.enterYr();
	Thread.sleep(20000);
	upstoxp3pom o3 = new upstoxp3pom(driver);
	o3.next();
	
}
}