package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements Constants{
 public  WebDriver driver;
 @Parameters({"browser"})
  @BeforeMethod
  public void openappn(String browser) 
 { if(browser.equals("firefox"))
 { System.setProperty(Gecko_key, Gecko_value);
	  
	  driver=new FirefoxDriver();
	  driver.manage()
	  .timeouts().implicitlyWait(20, TimeUnit.SECONDS);    
 }
 else
 {System.setProperty(Chrome_key, Chrome_value);
	driver=new ChromeDriver(); 
 }
 driver.get("http://localhost/login.do");
 }

  @AfterMethod
  public void closeappn() {
	  driver.quit();
  }

}
