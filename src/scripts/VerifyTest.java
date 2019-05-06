package scripts;

import generic.BaseTest;
import generic.Excel;

import org.testng.annotations.Test;

import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class VerifyTest extends BaseTest {
  @Test
  public void Verify() 
  {
	  LoginPage lp=new LoginPage(driver);
		 String un= Excel.getCelldata(xlpath, sheet, 0, 0);
		String pwd=  Excel.getCelldata(xlpath, sheet, 0, 1);
		  lp.setUn(un);
	  lp.setpwd(pwd);
	  lp.ClickLogin();
	  EnterTimeTrackPage etp=new EnterTimeTrackPage(driver);
	  etp.clickhelp();
	  etp.clickOnabout();
	  etp.Verifybuildnumber("(build 20792),");
	  etp.clickClose();
	  etp.clickLogout();
  }
}
