package scripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pract4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		Dimension h=new Dimension(1300,550);
		driver.manage().window().setSize(h);
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(3000);
		
		Point p=new Point(100,50);
		driver.manage().window().setPosition(p);
		driver.manage().window().getPosition();
		
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(3000);
		driver.close();
		
}
}