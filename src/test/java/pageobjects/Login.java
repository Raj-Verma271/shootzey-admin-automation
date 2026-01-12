package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testbase.BaseMethods;

public class Login extends BaseMethods{
	public Login(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@name='email']") WebElement email;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement Login;
	
	public void signIn(String Email) {
	    email.click();
        email.clear();
        email.sendKeys(Email);	 	
}
	
	
	public void password(String pwd) {
		password.clear();
		password.sendKeys(pwd);
		
}
	public void Login() {
		Login.click();
		
	}

}
