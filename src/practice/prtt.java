package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class prtt {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.cssSelector("#email")).sendKeys("harsfsfs");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'][1]")).click();
//driver.findElement(By.xpath("(//div[text()='31'])[1]")).click();
//  List<WebElement> cur = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1habvwh r-1loqt21 r-1777fci r-1mi0q7o r-1yt7n81 r-m611by r-1otgn73']"));
//for(WebElement ec:cur) {
//	System.out.println(ec.getText());
}
	}


	
