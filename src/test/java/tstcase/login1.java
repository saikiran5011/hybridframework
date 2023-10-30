package tstcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobject.login;

public class login1 extends base {
	public login1(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void logintest() throws InterruptedException {
		
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		login lp =new login(driver);
		lp.setUsername();
		
		lp.setPassword();
		
		lp.ClickLoginbtn();
		
		
		
	}

}

