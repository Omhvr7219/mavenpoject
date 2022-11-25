package prcticeproject2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trial {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Dell\\selenium 4.4\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//go to upstox URL
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	String str	=driver.findElement(By.xpath("//p[@class='text-center text-white']")).getText();
		
	str.split(" ");
	System.out.println(str);
//	char s2 = str.charAt(2);
//	System.out.println(s2);
	String []s=str.split(" ");
	System.out.println(s[2]);
	System.out.println(s[6]);
	
}
}