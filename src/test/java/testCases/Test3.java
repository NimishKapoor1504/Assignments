package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {
	
	static WebDriver driver;
  @Test
  public void test3() throws IOException {
	  
	  	File ss_test3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss_test3,new File("C:\\Users\\nimis\\OneDrive\\Documents\\ScreenShot\\ss_test3.png"));

  }
  
  @BeforeMethod
 	public void beforeMethod() {
 		System.setProperty("webdriver.chrome.driver","C:\\Users\\nimis\\OneDrive\\Documents\\Eclipse\\Assignment_1\\Drivers\\chromedriver.exe");
 		driver= new ChromeDriver();
 		driver.get("https://api.jquery.com/dblclick/");
 		driver.manage().window().maximize();
 		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 	}

 	@AfterMethod
 		public void afterMethod() {
 		driver.quit();
 	}
}
