package base_class_and_utility_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstox_login_pom_loginpage {
	@FindBy(xpath="//input[@id='userCode']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PW;
	@FindBy(xpath="//div[@class='_2Q-Qvmryo8OlgCHHPQqsDB undefined']") private WebElement signinbtn;
	
	public upstox_login_pom_loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void upstox_login_pom_loginpage_enter_username (String USN)
	{
		UN.sendKeys(USN);
	}
	public void upstox_login_pom_loginpage_password_enter (String PWD)
	{
		PW.sendKeys(PWD);
	}
	 
	public void upstox_login_pom_loginpage_click_signinbtn()
	{
		signinbtn.click();
	}
	
}
