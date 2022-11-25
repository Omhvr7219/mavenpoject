package upstox_trial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class t1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://login-v2.upstox.com/");
	driver.manage().window().maximize();
//	driver.get(utility_class.get_data_from_propertyfile("URL"));
	driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys("BV7682");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Omhvr@7219");
	driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
	driver.findElement(By.xpath("//input[@id='yob']")).sendKeys("1992");
	driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
	  List<WebElement> stocknames = driver.findElements(By.xpath("//div[@id='watchlistTestId']/div/div"));
	for(int i=0;i<=stocknames.size()-1;i++) {
		System.out.println(stocknames.get(i).getText());
		boolean result = stocknames.get(i).getText().contains("TCS");
		if(result) {
			stocknames.get(i).click();
		}
	
//		stocknames.get(0).click();
//		driver.findElement(By.xpath("//div[@class='Vuhs-X8BmnWJ3iqSHjWb'][1]")).click();
//	  driver.findElement(By.xpath("(//div[@class='_11UfTucfHcy8CKzMBRsJX8']//div[text()='Buy'][1]")).click();
}


}}
