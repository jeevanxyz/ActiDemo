package scripts;

import generic.BaseTest;
import generic.Excel;

import org.testng.annotations.Test;

import pom.LoginPage;

public class InvalidLoginTest extends BaseTest{
  @Test
  public void Invlaid() 
  {
	  LoginPage lp=new LoginPage(driver);
	  String un= Excel.getCelldata(xlpath, sheet, 1, 0);
		String pwd=  Excel.getCelldata(xlpath, sheet, 1,1);
	  lp.setUn(un);
	  lp.setpwd(pwd);
	  lp.ClickLogin();
	  lp.Verifyerrmsg();
	  
  }
}
