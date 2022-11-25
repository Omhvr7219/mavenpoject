package prcticeproject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class p1pom {

	@FindBy(xpath="//input[@name='username']") private WebElement UN;
	@FindBy(xpath="//input[@name='password']") private WebElement PW;
	@FindBy(xpath="//input[@value='admin']") private WebElement RB1;
	@FindBy(xpath="//input[@value='user']") private WebElement RB2;
	@FindBy(xpath="//button[@id='okayBtn']") private WebElement POP;
	@FindBy(xpath="//select[@class='form-control']") private WebElement SB;
	@FindBy(xpath="//input[@type='checkbox']") private WebElement AGR;
	@FindBy(xpath="//input[@id='signInBtn']") private WebElement SGNBTN;
	@FindBy(xpath="//p[@class='text-center text-white']") private WebElement str;
	
	//S2
	public p1pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//	public void mstr()
//	{
//		String strv = str.getText();
//	
//		System.out.println(strv);
//		String [] sr =	strv.split(" ");
//		System.out.println(sr[2]);
//		System.out.println(sr[6]);
//		String s2 = sr[2];
//		String s6 = sr[6];
//		
//	}
	
	public void mUN()
	{
		String strv = str.getText();
		
		System.out.println(strv);
		String [] sr =	strv.split(" ");
		System.out.println(sr[2]);
		System.out.println(sr[6]);
		String s2 = sr[2];
//		String s6 = sr[6];
		UN.sendKeys(s2);
	}
	public void mPW()
	{String strv = str.getText();
	
	System.out.println(strv);
	String [] sr =	strv.split(" ");
	System.out.println(sr[2]);
	System.out.println(sr[6]);
//	String s2 = sr[2];
	String s6 = sr[6];
	String s7 = s6.substring(0, 8);
	System.out.println(s7);
		PW.sendKeys(s7);
	}
//	public void mRB1()
//	{
//		
//	}
	public void mRB2()
	{
		RB2.click();
	}
	public void mPOP()
	{
		POP.click();
	}
	public void mSB()
	{   SB.click();
		Select sc=new Select(SB);
		sc.selectByVisibleText("Student");
		
		
	}
	public void mAGR()
	{
		AGR.click();
	}
	public void mSGNBTN()
	{
		SGNBTN.click();
	}
	
}
