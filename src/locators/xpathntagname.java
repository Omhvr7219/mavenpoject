package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathntagname {public static void main(String[] args) throws InterruptedException {
	

System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");

WebDriver  driver = new ChromeDriver();

//driver.get("https://www.fb.com/");
//Thread.sleep(3000);
//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123333225666");
//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
//Thread.sleep(3000);
//driver.navigate().back();
//Thread.sleep(3000);
//driver.findElement(By.xpath("//a[contains(text(),'a Page')]")).click();
//driver.navigate().back();
//Thread.sleep(3000);
//driver.findElement(By.xpath("//button[contains(@type,'mit')]")).click();
//driver.navigate().back();
//Thread.sleep(3000);
//driver.findElement(By.xpath("//input[@type='text'][2])")).sendKeys("999999999"); //not input type two times
//driver.findElement(By.tagName("body")).sendKeys("1212121");

driver.get("https://www.facebook.com/");
//input[@type='text']
//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("2222222");
//driver.findElement(By.className("_8esh")).click();
driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
boolean hr= driver.findElement(By.xpath("//input[@value='1']")).isSelected();

System.out.println(hr);


}
}