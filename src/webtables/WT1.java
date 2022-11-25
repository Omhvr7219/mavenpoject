package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WT1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Dell\\selenium 4.4\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.mahadiscom.in/en/important-links/");
	 List<WebElement> rs = driver.findElements(By.xpath("//table[@class='table price-table']//tr"));
	 int rse=rs.size();
	 System.out.println(rse);
	 List<WebElement> cs = driver.findElements(By.xpath("//table[@class='table price-table']//tr[3]/td"));
	 int cse= cs.size();
	 System.out.println(cse);
	 List<WebElement> hr = driver.findElements(By.xpath("//table[@class='table price-table']//tr[1]/th"));
	 int hre=hr.size();
	 System.out.println(hre);
	  String headr1data = driver.findElement(By.xpath("//table[@class='table price-table']//tr[1]/th[1]")).getText();
	  System.out.println(headr1data);
	  String r3c2 = driver.findElement(By.xpath("//table[@class='table price-table']//tr[3]/td[2]")).getText();
	  System.out.println(r3c2);
	  for(int i =1;i<=3;i++)
	  {
		 String datainall = driver.findElement(By.xpath("//table[@class='table price-table']//tr[2]/td["+i+"]")).getText();
		  System.out.println(datainall);
	  }
	  for(int i =1;i<=3;i++)
	  {
		 String hd = driver.findElement(By.xpath("//table[@class='table price-table']//tr[1]/th["+i+"]")).getText();
		  System.out.println(hd);
	  }
	  System.out.println("--all---");
	  for(int i=1;i<=rse;i++)
	  {
		  for(int j=1;j<=cse;j++) 
		  {
			  String da = driver.findElement(By.xpath("//table[@class='table price-table']//tr["+i+"]/td["+j+"]")).getText();
			  System.out.print(da);  
		  }System.out.println();
	  }
	  
}
}
