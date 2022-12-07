package upstox_trial;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class prct {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.xpath("//input[@value='radio2']")).click();
	driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
	Actions act = new  Actions(driver);
//	act.moveToElement(driver.findElement(By.xpath("//input[@id='autocomplete']"))).click();
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).perform();
WebElement drp = driver.findElement(By.name("dropdown-class-example"));
Select st =new Select (drp);
st.selectByIndex(2);
WebElement hr = st.getFirstSelectedOption();
System.out.println(hr.getText());
List<WebElement> lst = driver.findElements(By.xpath("//input[@type='checkbox']"));
for(WebElement lt:lst) {
	Thread.sleep(2000);
lt.click();}
driver.findElement(By.xpath("//button[@class='btn-style class1']")).click();
Set<String> ids = driver.getWindowHandles();
ArrayList<String> al= new ArrayList <String>(ids);
System.out.println(al);
String parent = al.get(0);
String child = al.get(1);
driver.switchTo().window(child);
Thread.sleep(10000);
driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
driver.findElement(By.xpath("//span[text()='Login']")).click();
}





	
}

