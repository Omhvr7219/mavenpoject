package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lbex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\admin\\Desktop\\mutiselect.html");
		WebElement q=driver.findElement(By.xpath("//select[@id='1234']"));
		Select s =new Select(q);
		s.selectByIndex(2);
		System.out.println(s.isMultiple());
//		List<WebElement> w = s.getOptions();
//		for (WebElement e:w)
//	    System.out.println(e.getText());
		List<WebElement> w = s.getAllSelectedOptions();
		for (WebElement e:w)
	    System.out.println(e.getText());

	}

}
