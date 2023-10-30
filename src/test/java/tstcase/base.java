package tstcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class base {
	public String baseURL="https://adactinhotelapp.com/index.php";
	
	public static WebDriver driver;

	@BeforeClass
	public void openApplication() {
		
		//launch browser
		driver=new ChromeDriver();
		
		
		
	}
	
	@AfterClass
	public void closeApplication() {
		driver.close();
	}
	

}

