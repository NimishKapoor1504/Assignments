package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	static WebDriver  driver;
  @Test
  public void test1() {
	  WebElement firstName= driver.findElement(By.id("firstName"));
	  WebElement lastName= driver.findElement(By.id("lastName"));
	  WebElement userName= driver.findElement(By.id("username"));
	  WebElement password= driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input"));
	  WebElement confirm= driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input"));
	  
	  if(firstName.getAttribute("type").equals("text")&& lastName.getAttribute("type").equals("text")) {
		  firstName.sendKeys("Dan");
		  lastName.sendKeys("Brown");
		 }
	  
	  if(userName.getAttribute("type").equals("email"))
		  userName.sendKeys("DanBrown7890");
	  
	  if(password.getAttribute("type").equals("password")&&confirm.getAttribute("type").equals("password")) {
		  password.sendKeys("Dan@808");
		  confirm.sendKeys("Dan@808");
	  }
	  
	  driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/div[2]")).click();

 }
  
  @BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nimis\\OneDrive\\Documents\\Eclipse\\Assignment_1\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signup");	
	}

	@AfterMethod
		public void afterMethod() {
		driver.quit();
	}
}
