package pom_driver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.bouncycastle.oer.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.*;
import org.testng.annotations.AfterClass;

public class Basic_Driver_Setup_1 {
	
	String URL="https://practicetestautomation.com/practice-test-login/";
	
   public RemoteWebDriver driver =null;
  @BeforeClass
  public void beforeClass() {

	   System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\ChromeDriver\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.navigate().to(URL);
	   
	   
	  
  }

@AfterClass
  public void after_exeution() {
	 driver.quit();
  }

}
