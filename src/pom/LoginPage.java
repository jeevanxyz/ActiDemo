package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//span[.='Username or Password is "
			+ "invalid. Please try again.']")
	private WebElement errmsg;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setUn(String usn)
	{
		username.sendKeys(usn);
	}
	public void setpwd(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void ClickLogin()
	{
		loginbutton.click();
	}
	public void Verifyerrmsg()
	{
		Assert.assertTrue(errmsg.isDisplayed());
	}
}
