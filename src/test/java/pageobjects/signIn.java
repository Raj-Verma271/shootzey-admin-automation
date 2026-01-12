package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testbase.BaseMethods;

public class signIn extends BaseMethods{
	
	public signIn(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//input[@name='email']") WebElement email;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement Login;
	@FindBy(xpath="//a[normalize-space()='Package']") WebElement Package;
	@FindBy(xpath="//a[normalize-space()='Add Package']")WebElement AddPackageButton;
	@FindBy(xpath="//input[@name='name']") WebElement PackageName;
	@FindBy(xpath="//input[@name='banner_image']") WebElement BannerImage;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]") WebElement category;
	@FindBy(xpath="//div[contains(text(), 'Package Category Test 1')]") WebElement CategoryOption;
	@FindBy(xpath="//input[@name='functions']") WebElement Functions;
	@FindBy(xpath="//input[@name='team_number']") WebElement TeamNumber;
	@FindBy(xpath="//div[@class='col-xl-6 col-lg-6 col-md-6 col-sm-12']//div[contains(@class,'css-19bb58m')]")WebElement City;
	@FindBy(xpath="//div[contains(text(),'pilibhit')]")WebElement CityOption;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[9]/div[1]/div[1]/div[1]") WebElement SelectPackage;	
	@FindBy(xpath="//div[contains(text(), 'Hourly Rental Packages')]") WebElement PackageOption;
	
//	@FindBy(xpath="//div[contains(text(), 'Rajeev Test Premium Package')]") WebElement PackageOptions;
	@FindBy(xpath="//input[@name='mrp']") WebElement MRP;
	@FindBy(xpath="//input[@name='discount_percentage']")WebElement Discount;
//	@FindBy(xpath="//input[@name='selling_price']")WebElement SellingPrice;
	@FindBy(xpath="//input[@name='advance_amount']")WebElement AdvanceAmount;
	@FindBy(xpath="//input[@class='rmdp-input']")WebElement BlockDates;
	@FindBy(xpath="//input[@name='lat']")WebElement lat;
	@FindBy(xpath="//input[@name='long']")WebElement longtitude;
	@FindBy(xpath="//div[@class='se-wrapper-inner se-wrapper-wysiwyg sun-editor-editable']") WebElement ShortDescription;
	@FindBy(xpath="//body/div[@id='root']/div[@class='horizontalMenucontainer']/div[@class='page']/div[@class='page-main']/div[contains(@class,'main-content app-content')]/div[@class='side-app']/div[@class='main-container container-fluid']/div[@class='row']/div[@class='p-5 card']/form/div[@class='gy-2 row']/div[19]/div[1]/div[1]/div[4]/div[1]")WebElement LongDescription;
	@FindBy(xpath="//button[contains(text(),'Submit')]")WebElement SubmitButton;
	
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
	public void SetName(String name) {
		PackageName.click();
		PackageName.sendKeys(name);
	}
	public void BannerIamge() {
		String File1="C:/Users/RAJEEV VERMA/Downloads/1.sm.webp";
		BannerImage.sendKeys(File1);
		
	}
	public void setcategory(){
		category.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("arguments[0].click();", CategoryOption);
		
	}
	public void setFunctions(String function) {
		Functions.sendKeys(function);
	}
	public void setTeamNumber(String team) {
		TeamNumber.sendKeys(team);
	}
	public void setCity(String city) {
		City.click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("arguments[0].click();", CityOption);
	}
	public void selectPackage() {
		SelectPackage.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("arguments[0].click();", PackageOption);
		
		
	}
	public void setmrp(String mrp) {
		MRP.sendKeys(mrp);
		
		
	}
	public void setDiscount(String discount) {
		Discount.sendKeys(discount);
	}
	public void setAdvancePayment(String AdvPayment) {
		AdvanceAmount.sendKeys(AdvPayment);
		
	}
	public void setDate(String date) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    // Scroll the element into view
	    js.executeScript("arguments[0].scrollIntoView(true);", BlockDates);
	    
	    // Click using JavaScript (if needed)
	    js.executeScript("arguments[0].click();", BlockDates);

	    // Send date to the input field
	    BlockDates.sendKeys(date);
	}
	public void setLatitude(String Latitude) {
		lat.sendKeys(Latitude);
	}
	public void setLongtitude(String Longtitude) {
		longtitude.sendKeys(Longtitude);
		
	}
	public void setShortDescription(String shortdescription) {
		ShortDescription.sendKeys(shortdescription);	
		
	}
	public void setLongDescription(String longdescription) {
		LongDescription.sendKeys(longdescription);
	}
	public void clickSubmitButton() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		    
		    // Scroll the element into view
		    js.executeScript("arguments[0].scrollIntoView(true);", SubmitButton);
		    
		    // Click using JavaScript (if needed)
		    js.executeScript("arguments[0].click();", SubmitButton);
		    
		    
	}





  





















	




}

	
	
	
	
	