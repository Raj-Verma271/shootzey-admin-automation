//package testcases;
//
//import java.time.Duration;
//
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import pageobjects.signIn;
//import utilities.Dataprovider;
//
//public class logintestcases extends SetupMethod {
//	
//	    @Test(dataProvider="LoginData",dataProviderClass = Dataprovider.class)
//	
//	    public void verify_Login(String Email, String pwd,String Name,String Functions,String Team,String City,String MRP,String Discount,
//			                 String AdvancePayment,String Date,String Latitude,String Longtitude,String Shortdescription,String Longdescriptrion) 
//			                 throws InterruptedException {
//	    	signIn lg=new signIn(driver);
//			lg.signIn(Email);
//			lg.password(pwd);
//			lg.Login();
//			 
//		 
//			Thread.sleep(3000);
//			lg.ClickPackage();
//			lg.ClickAddPackage();
//			lg.SetName(Name);
//			lg.BannerIamge();	
//			lg.setcategory();
//			lg.setFunctions(Functions);
//			lg.setTeamNumber(Team);
//			lg.setCity(City);
//			lg.selectPackage();
//			lg.setmrp(MRP);
//			lg.setDiscount(Discount);
//			lg.setAdvancePayment(AdvancePayment);
//			lg.setDate(Date);
//			lg.setLatitude(Latitude);
//			lg.setLongtitude(Longtitude);
//			lg.setShortDescription(Shortdescription);
//			Thread.sleep(3000);
//			lg.setLongDescription(Longdescriptrion);
//			Thread.sleep(3000);
//			lg.clickSubmitButton();
//					
//	}
//	    
//}










package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageobjects.signIn;
import utilities.Dataprovider;

public class logintestcases extends SetupMethod {
    signIn lg;

    @Test(priority = 1, dataProvider = "LoginData", dataProviderClass = Dataprovider.class)
    public void loginTest(String Email, String pwd, String Name, String Functions, String Team, String City, String MRP,
                          String Discount, String AdvancePayment, String Date, String Latitude, String Longtitude,
                          String Shortdescription, String Longdescriptrion) throws InterruptedException {
        lg = new signIn(driver);
        lg.signIn(Email);
        lg.password(pwd);
        lg.Login();
    }

    @Test(priority = 2, dependsOnMethods = "loginTest", dataProvider = "LoginData", dataProviderClass = Dataprovider.class)
    public void createPackageTest(String Email, String pwd, String Name, String Functions, String Team, String City, String MRP,
                                  String Discount, String AdvancePayment, String Date, String Latitude, String Longtitude,
                                  String Shortdescription, String Longdescriptrion) throws InterruptedException {

        Thread.sleep(3000);
        lg.ClickPackage();
        lg.ClickAddPackage();
        lg.SetName(Name);
        lg.BannerIamge();
        lg.setcategory();
        lg.setFunctions(Functions);
        lg.setTeamNumber(Team);
        lg.setCity(City);
        lg.selectPackage();
        lg.setmrp(MRP);
        lg.setDiscount(Discount);
        lg.setAdvancePayment(AdvancePayment);
        lg.setDate(Date);
        lg.setLatitude(Latitude);
        lg.setLongtitude(Longtitude);
        lg.setShortDescription(Shortdescription);
        Thread.sleep(3000);
        lg.setLongDescription(Longdescriptrion);
        Thread.sleep(3000);
        lg.clickSubmitButton();
        WebElement DataTable= driver.findElement(By.xpath("//span[normalize-space()='Show']"));
        assert DataTable.isDisplayed() : "Add Package: DataTable  not found.";
    }
}

