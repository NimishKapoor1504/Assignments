package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	
	static  WebDriver driver;
  @Test
  public void test2() throws InterruptedException {
	  driver.findElement(By.linkText("Medical Records")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.linkText("Search Patient")).click();
	  Thread.sleep(1000);
	  
	  Select s1 = new Select(driver.findElement(By.id("search_type")));
	  s1.selectByIndex(2);
	  Thread.sleep(1000);
	  
	  driver.findElement(By.id("search_patient")).click();
	  Thread.sleep(1000);
	  
	 
  }
  
  @BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nimis\\OneDrive\\Documents\\Eclipse\\Assignment_1\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://openclinic.sourceforge.net/openclinic/home/index.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterMethod
		public void afterMethod() {
		driver.quit();
	}
}
