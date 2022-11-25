package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementssssss {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	driver.get("https://www.youtube.com//");
	Thread.sleep(3000);
	List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	
	System.out.println(alllinks.size());
	
	for(WebElement btns:alllinks)
	{System.out.println(btns.getText());}
	
	
	
}
}
