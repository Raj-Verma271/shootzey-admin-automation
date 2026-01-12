package testcases;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.Login;
import utilities.Dataprovider;

public class LoginTest extends SetupMethod {
	private String  Email="shivam@gmail.com";
	private String Password="12345678";
	
	@Test(groups="login")
	public void Verify_LoginTest() {
		Login lt=new Login(driver);
		lt.signIn(Email);
		lt.password(Password);
		lt.Login();
		
		
	}

}
