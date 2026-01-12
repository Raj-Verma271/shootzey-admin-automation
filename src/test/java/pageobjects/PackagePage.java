package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testbase.BaseMethods;

public class PackagePage extends BaseMethods {
	public PackagePage (WebDriver driver) {
		super(driver);
	}
	
	
	

	@FindBy(xpath="//input[@placeholder='Email']") WebElement email;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement Login;
	@FindBy(xpath="//a[normalize-space()='Package']") WebElement Package;
	@FindBy(xpath="//a[normalize-space()='Add Package']")WebElement AddPackageButton;
	
	
	
	public void logIn(String Email) throws InterruptedException {
	    email.click();
        email.clear();
      
        email.sendKeys(Email);	 	
}
	public void Setpassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
		
}
	public void Login() {
		Login.click();
		
	}
	
	public void  ClickPackage() {
		//Package.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].click();", Package);
		
	}
	public void ClickAddPackage() {
//		AddPackageButton.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].click();", AddPackageButton);
	}
	

}


//package pageobjects;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import testbase.BaseMethods;
//
//public class PackagePage extends BaseMethods {
//
//    public PackagePage(WebDriver driver) {
//        super(driver);
//    }
//
//    @FindBy(xpath = "//a[contains(@class, 'side-menu__item') and contains(@href, '/package/')]")
//    public WebElement Package;
//
//    @FindBy(xpath = "//a[normalize-space()='Add Package']")
//    public WebElement AddPackageButton;
//
//    public void ClickPackage() {
////        wait.until(ExpectedConditions.visibilityOf(Package)); // Ensure element is visible
//
//        try {
//            System.out.println("Clicking 'Package' menu using normal click...");
//            Package.click(); // Try normal click
//        } catch (Exception e) {
//            System.out.println("Normal click failed. Trying JavaScript Click...");
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].click();", Package); // JavaScript Click
//        }
//    }
//
//    public void ClickAddPackage() {
////        wait.until(ExpectedConditions.visibilityOf(AddPackageButton)); // Ensure element is visible
//
//        try {
//            System.out.println("Clicking 'Add Package' using normal click...");
//            AddPackageButton.click();
//        } catch (Exception e) {
//            System.out.println("Normal click failed. Trying JavaScript Click...");
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].click();", AddPackageButton);
//        }
//    }
//}
//
