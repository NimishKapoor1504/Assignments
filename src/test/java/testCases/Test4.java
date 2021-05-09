package testCases;


import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test4 {
  
	static WebDriver driver;
	@Test
  public void test4() throws IOException, InterruptedException {
	  String filePath = "C:\\Users\\nimis\\OneDrive\\Desktop\\Project\\SampleXL.xlsx";
	  FileInputStream file = new FileInputStream(filePath);
	  XSSFWorkbook book = new XSSFWorkbook(file);
	  XSSFSheet sheet = book.getSheet("Sheet1");
	   String  searchTerm = sheet.getRow(0).getCell(0).getStringCellValue(); 
	   String  searchTerm1 = sheet.getRow(1).getCell(0).getStringCellValue(); 
	   String  searchTerm2 = sheet.getRow(2).getCell(0).getStringCellValue(); 
	  
	  driver.findElement(By.id("header-search-input")).sendKeys(searchTerm);
	  Thread.sleep(1000);
	  driver.findElement(By.id("header-search-input")).sendKeys(searchTerm1);
	  Thread.sleep(1000);
	  driver.findElement(By.id("header-search-input")).sendKeys(searchTerm2);
	  Thread.sleep(1000);
	  driver.findElement(By.id("header-desktop-search-button")).click();
	  Thread.sleep(1000);
	  
  }
  
  @BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nimis\\OneDrive\\Documents\\Eclipse\\Assignment_1\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://in.yahoo.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterMethod
		public void afterMethod() {
		driver.quit();
	}
}
