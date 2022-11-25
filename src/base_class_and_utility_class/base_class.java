package base_class_and_utility_class;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class {
	WebDriver driver;
//author name  =  @Harshad
//base class consist of mandatory code run everytime like open browser
public void initialize_broweser() throws IOException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	driver.get("https://login-v2.upstox.com/");
	driver.get(utility_class.get_data_from_propertyfile("URL"));
}




}
