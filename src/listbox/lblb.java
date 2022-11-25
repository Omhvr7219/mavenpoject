package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lblb {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(3000);
	WebElement month = driver.findElement(By.name("birthday_month"));
	Select sc = new Select(month);
	sc.isMultiple();
	System.out.println(sc.isMultiple());
	sc.selectByIndex(5);
	Thread.sleep(3000);
	List<WebElement> mths = sc.getOptions();
	for(WebElement o:mths)
	
		System.out.println(o.getText());
	WebElement fo = sc.getFirstSelectedOption();
	
   System.out.println("first option is:"+fo.getText());
   List<WebElement> al = sc.getAllSelectedOptions();
	for(WebElement w : al)
		System.out.println(w.getText());
}
}
