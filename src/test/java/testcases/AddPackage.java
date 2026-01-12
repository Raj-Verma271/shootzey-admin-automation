package testcases;

import org.testng.annotations.Test;

import pageobjects.PackagePage;
import utilities.Dataprovider;

public class AddPackage extends SetupMethod {
	@Test(dataProvider="LoginData",dataProviderClass = Dataprovider.class)
	public void verify_AddPackage(String Email,String Password) throws InterruptedException {
	PackagePage pkg = new PackagePage(driver);
	Thread.sleep(3000);
	pkg.logIn(Email);
	pkg.Setpassword(Password);
	pkg. ClickPackage();
	pkg.ClickAddPackage();

	
}
}
	