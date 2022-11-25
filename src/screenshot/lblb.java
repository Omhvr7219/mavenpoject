package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lblb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\admin\\Desktop\\mutiselect.html");
	WebElement we=	driver.findElement(By.xpath("//select[@multiple='true']"));
	Select hr = new Select (we);
	hr.selectByIndex(0);
	hr.selectByVisibleText("Pak");
//	hr.selectByValue("1");
System.out.println(hr.isMultiple());	
Thread.sleep(2000);
hr.deselectByIndex(3);
		
		
		
		
		
		
		
		
		
		
	}

}
