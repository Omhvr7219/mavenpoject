package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lb55 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mahadbtmahait.gov.in/Grievance/Grievance");
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[text()='Proceed to mahadbtmahait.gov.in (unsafe)']")).click();
		WebElement district = driver.findElement(By.xpath("//select[contains(@id,'DistrictID')]"));
		Select sc = new Select(district);
		sc.selectByIndex(5);
		sc.selectByValue("522");
		sc.selectByVisibleText("Pune");
		sc.isMultiple();
		System.out.println(sc.isMultiple());
		List<WebElement> dtc = sc.getOptions();
		for(WebElement dist:dtc) {
			System.out.println(dist.getText());
			
		}
		try {
		sc.deselectByVisibleText("Pune");}
		catch(Exception message) {
			System.out.println("here is risky code e xc is coming");
		}
		sc.getFirstSelectedOption();
		System.out.println(sc.getFirstSelectedOption().getText());
		
		

	}
}
