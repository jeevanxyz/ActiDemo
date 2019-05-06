package scripts;

import generic.BaseTest;
import generic.Excel;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class ValidLoginLogoutTest extends BaseTest{
  @Test
  public void ValidTest()
  {
	  LoginPage lp=new LoginPage(driver);
	 String un= Excel.getCelldata(xlpath, sheet, 0, 0);
	String pwd=  Excel.getCelldata(xlpath, sheet, 0, 1);
	  lp.setUn(un);
  lp.setpwd(pwd);
  lp.ClickLogin();
 String actual=driver.getTitle();
  Assert.assertEquals(actual, "actiTIME - Enter Time-Track");
 EnterTimeTrackPage etp=new EnterTimeTrackPage(driver);
 etp.clickLogout();
	  
  }
}
