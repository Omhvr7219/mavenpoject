package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ex1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Dell\\selenium 4.4\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://qavbox.github.io/demo/");
		driver.findElement(By.xpath("//a[text()='SignUp Form']")).click();
		driver.findElement(By.name("uname")).sendKeys("Harshad.randive");
		driver.findElement(By.cssSelector("input#email")).sendKeys("harshadrandive@gmail.com");
		driver.findElement(By.xpath("//input[@id='tel']")).sendKeys("86000906765");
//	driver.findElement(By.cssSelector("input#fax")).sendKeys("02133224518");
		WebElement gender = driver.findElement(By.name("sgender"));
		Select gd = new Select(gender);
		gd.selectByVisibleText("Male");
		driver.findElement(By.xpath("//input[@value='three']")).click();
		driver.findElement(By.xpath("//input[@value='automationtesting']")).click();
		driver.findElement(By.xpath("//option[@class='ui-widget-content'][7]")).click();
		driver.findElement(By.name("commit")).click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		alt.getText();
		System.out.println(alt.getText());
		alt.accept();
		driver.findElement(By.name("home")).click();
		driver.findElement(By.xpath("//a[text()='WebTable']")).click();
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='table02']//tr"));
		int rsz = row.size();
		System.out.println(rsz);
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='table02']//tr[1]//td"));
		int csz = col.size();
		System.out.println(csz);

		for (int i = 1; i <= rsz - 1; i++) {

			for (int j = 1; j <= csz - 1; j++) {
				String a = driver.findElement(By.xpath("//table[@id='table02']//tr[" + i + "]//td[" + j + "]"))
						.getText();
				System.out.print(a + "\t");
			}
			System.out.println();
		}

	}

}