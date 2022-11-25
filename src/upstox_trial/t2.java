package upstox_trial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class t2 {
	public static void main(String[] args) {

		int sum =0;
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	
		for (int i = 1; i <= 9; i++) {
			int values;
			String value = driver.findElement(By.xpath("(//table[@id='product'])[2]//tr[" + i + "]/td[4]")).getText();
//			System.out.println(value);
			values = Integer.parseInt(value);
//	sum = sum +values;
//	System.out.println(sum);
			sum = sum + values ;
		}
	
		System.out.println(sum);
	}
}