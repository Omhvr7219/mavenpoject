package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxp1pom {
	
	//step 1: declaring gloabal variable in pom webelement is variable and webpage is class

@FindBy(xpath="//input[@id='userCode']") private WebElement UN; //WebElement UN=driver.findElelent((By.xpath(""));

@FindBy(xpath="//input[@id='password']") private WebElement PW;

@FindBy(xpath="//div[@class='_2Q-Qvmryo8OlgCHHPQqsDB undefined']") private WebElement sbtn;

//step2: Initialize within a constructor with access level public using pagefactory class 

 public upstoxp1pom(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }

//setp3:Utilize within a method with access level public 
 
 public void enterUN()
 {
	 UN.sendKeys("BV7682");
 }
 public void enterPW() 
 {
	 PW.sendKeys("Omhvr@7219");
 }
 public void click() 
 {
	 sbtn.click();
 }
 
}
