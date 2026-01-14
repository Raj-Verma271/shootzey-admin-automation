//package testcases;
//
//
//
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import pageobjects.Login;
//import utilities.Dataprovider;
//
//public class LoginTest extends SetupMethod {
//	private String  Email="shootesy@gmail.com";
//	private String Password="Admin@12345";
//	
//	@Test(groups="login")
//	public void Verify_LoginTest() {
//		Login lt=new Login(driver);
//		lt.signIn(Email);
//		lt.password(Password);
//		lt.Login();
//		
//		
//	}
//
//}

package testcases;

import org.testng.annotations.Test;
import pageobjects.Login;

public class LoginTest extends SetupMethod {

    private String Email = "shootesy@gmail.com";
    private String Password = "Admin@12345";

    @Test(groups = "login")
    public void Verify_LoginTest() {

        Login lt = new Login(driver);
        lt.signIn(Email);
        lt.password(Password);
        lt.Login();
    }
}

