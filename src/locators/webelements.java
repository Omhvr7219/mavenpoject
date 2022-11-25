package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");

		WebDriver  driver = new ChromeDriver();

//		driver.get("https://www.fb.com/");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
//		Thread.sleep(2000);
//		boolean hrv = driver.findElement(By.xpath("//input[@class='_8esa'][1]")).isEnabled();
//		System.out.println(hrv);
//		if (hrv == true)
//		{System.out.println("selected");}	
//		else
//		{System.out.println("notselected");}
		driver.get("https://www.freecharge.in/");
	driver.findElement(By.linkText("Login")).click();

}
}