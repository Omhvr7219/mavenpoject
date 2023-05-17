package calender;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cl1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.goibibo.com/");
	driver.findElement(By.xpath("(//a[@href=\"/cars/\"])[1]")).click();
	driver.findElement(By.xpath("(//span[@class='HomeSearchWidgetstyles__DateTxt-sc-1rvppov-7 eiggyI'])[1]")).click();
	String month = "January 2023";
	
	
	
	while (true)
	{
		String moyr = driver.findElement(By.xpath("//p[@class='dcalendarstyles__MonthNamePara-sc-r2jz2t-3 cgPmkC']")).getText();
		
		if( moyr.equalsIgnoreCase(month))
				{
			break;
		        }
		else {
			driver.findElement(By.xpath("//div[@data-testid='calendarRightArrowBtn']")).click();
		}
		 driver.findElement(By.xpath("//ul[@class='dcalendarstyles__DateWrapDiv-sc-r2jz2t-7 ccIMFc']/li[25]")).click();
//		Actions act = new Actions(driver);
//		act.moveToElement(next).perform();
//		act.sendKeys(Keys.ENTER).perform();
	}
	
}
}
