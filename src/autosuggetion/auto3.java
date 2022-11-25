package autosuggetion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	List<WebElement> rs = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']//div"));
    int lsr=rs.size();
    System.out.println(lsr);
    rs.get(lsr-15).click();

	
}
}
