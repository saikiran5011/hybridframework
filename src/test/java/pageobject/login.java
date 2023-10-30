package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	
	public WebDriver driver;
	
	public login(WebDriver driver) {
		this.driver=driver;
         PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	WebElement txtusername;
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="login")
	WebElement btnlogin;
	
	
	public void setUsername() {
		txtusername.sendKeys("saikiran");
		
	}
	public void setPassword() {
		txtpassword.sendKeys("sai@1254");
	}
	
	public void ClickLoginbtn() {
		btnlogin.click();
	}
}
