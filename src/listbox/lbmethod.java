package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lbmethod {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\Users\\admin\\Desktop\\mutiselect.html");
WebElement e =	driver.findElement(By.xpath("//select[@id='1234']"));
Select f=new Select(e);
//System.out.println(f.isMultiple());
f.selectByIndex(2);
//f.selectByVisibleText("Pak");
Thread.sleep(2000);
//f.deselectByIndex(2);
//Thread.sleep(2000);
//f.deselectByVisibleText("Pak");
//List<WebElement> g = f.getOptions();
//for (WebElement h:g)
//{	System.out.println(h.getText());}
//
//
//}

//List<WebElement> k = f.getAllSelectedOptions();
//for(WebElement l:k)
//	System.out.println(l.getText());

WebElement p = f.getFirstSelectedOption();

	System.out.println(p.getText());

}
}