package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EnterTimeTrackPage {
@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
private WebElement helpdd;

@FindBy(xpath="//a[.='About actiTIME']")
private WebElement aboutActi;

@FindBy(xpath="//span[contains(.,'build')]")
private WebElement buildnumber;

@FindBy(xpath="//img[@title='Close']")
private WebElement close;

@FindBy(xpath="//a[.='Logout']")
private WebElement logoutlink;

public EnterTimeTrackPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void clickhelp()
{
	helpdd.click();
}
public void clickOnabout()
{
	aboutActi.click();
}
public void Verifybuildnumber(String ebuildnumber)
{
	String abuildnumber=buildnumber.getText();
	Assert.assertEquals(abuildnumber, ebuildnumber);
}
public void clickClose()
{
	close.click();
}
public void clickLogout()
{
	logoutlink.click();
}


}
