package pageobjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testbase.BaseMethods;

public class equipment extends BaseMethods {
	public equipment(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@placeholder='Email']") WebElement email;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement Login;
	@FindBy(xpath="//span[normalize-space()='Catalogue']") WebElement Catalogue;
	@FindBy(xpath="//a[normalize-space()='Equipment']")WebElement Equipment;
	@FindBy(xpath="//a[normalize-space()='Add Equipment']")WebElement AddEuipment;
	@FindBy(xpath="//input[@name='name']")WebElement Name;
	@FindBy(xpath="//input[@type='file']")WebElement File;
	@FindBy(xpath="//body/div[@id='root']/div[@class='horizontalMenucontainer']/div[@class='page']/div[@class='page-main']/div[@class='main-content app-content ']/div[@class='side-app']/div[@class='main-container container-fluid']/div[@class='row']/div[@class='p-5 card']/form/div[@class='gy-2 row']/div[4]/div[1]/div[1]/div[1]/div[1]")WebElement Category;
	@FindBy(xpath="//div[contains(text(), 'Lens')]")WebElement CategoryOption;
	@FindBy(xpath="//input[@name='sensor_type']")WebElement SensorType;
	@FindBy(xpath="//input[@name='video_resolution']")WebElement VideoResolution;
	@FindBy(xpath="//input[@name='connectivity']")WebElement Connectivity;	
	@FindBy(xpath="//div[@class='col-xl-6 col-lg-6 col-md-6 col-sm-12']//div[contains(@class,'css-hlgwow')]")WebElement City;
	@FindBy(xpath="//div[contains(text(),'pilibhit')]")WebElement CityOption;
	@FindBy(xpath="//body/div[@id='root']/div[@class='horizontalMenucontainer']/div[@class='page']/div[@class='page-main']/div[@class='main-content app-content ']/div[@class='side-app']/div[@class='main-container container-fluid']/div[@class='row']/div[@class='p-5 card']/form/div[@class='gy-2 row']/div[10]/div[1]/div[1]/div[1]/div[1]")WebElement SelectEquipment;
	@FindBy(xpath="//div[contains(text(),'test equipment 1 tested')]")WebElement EquipmentOptions;
	@FindBy(xpath="//div[@class='col-md-10 col']//div//select[@id='input-select']")WebElement Feature;
	@FindBy(xpath="//textarea[@name='specification[0].specifications']")WebElement Specifications;
	@FindBy(xpath="(//input[@name='pricing[0].mrp'])[1]")WebElement MRP1;
	@FindBy(xpath="(//input[@name='pricing[0].selling_price'])[1]")WebElement SellingPrice1;
	@FindBy(xpath="(//input[@name='pricing[1].mrp'])[1]")WebElement MRP2;
	@FindBy(xpath="(//input[@name='pricing[1].selling_price'])[1]")WebElement SellingPrice2;
	@FindBy(xpath="(//input[@name='pricing[2].mrp'])[1]")WebElement MRP3;
	@FindBy(xpath="(//input[@name='pricing[2].selling_price'])[1]")WebElement SellingPrice3;
	@FindBy(xpath="(//input[@name='pricing[3].mrp'])[1]")WebElement MRP4;
	@FindBy(xpath="(//input[@name='pricing[3].selling_price'])[1]")WebElement SellingPrice4;
	@FindBy(xpath="(//input[@name='pricing[4].mrp'])[1]")WebElement MRP5;
	@FindBy(xpath="(//input[@name='pricing[4].selling_price'])[1]")WebElement SellingPrice5;
	@FindBy(xpath="(//input[@name='pricing[5].mrp'])[1]")WebElement MRP6;
	@FindBy(xpath="(//input[@name='pricing[5].selling_price'])[1]")WebElement SellingPrice6;
	@FindBy(xpath="//input[@name='tax_percentage']")WebElement Tax;
	@FindBy(xpath="//input[@name='lat']")WebElement Lat;
	@FindBy(xpath="//input[@name='long']")WebElement Long;
	@FindBy(xpath="//body/div[@id='root']/div[@class='horizontalMenucontainer']/div[@class='page']/div[@class='page-main']/div[@class='main-content app-content ']/div[@class='side-app']/div[@class='main-container container-fluid']/div[@class='row']/div[@class='p-5 card']/form/div[@class='gy-2 row']/div[17]/div[1]/div[1]/div[4]/div[1]")WebElement ShortDescription;
	@FindBy(xpath="(//div[contains(@class, 'sun-editor-editable')])[2]")WebElement LongDescription;
	@FindBy(xpath="//button[contains(text(),'Submit')]")WebElement SaveButton;
	
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

	public void clickCatalogue() {
		Catalogue.click();	}
	
	public void clickEquipment() throws InterruptedException {
		Thread.sleep(1000);
		Equipment.click();
	}
	
	
	public void clickAddEquipment() throws InterruptedException {
		Thread.sleep(1000);
		AddEuipment.click();
	}
	public void SetEquipmentName(String EquipmentName) {
		Name.sendKeys(EquipmentName);
	}
	public void SetBannerImage() {
		String Filepath="C:/Users/RAJEEV VERMA/Downloads/bc89503ae7d7475db3cc199c220b2842d4292322.png";
		File.sendKeys(Filepath);
		
	}
	public void SelectCategry() throws InterruptedException {
		Thread.sleep(2000);
      	Category.click();
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("arguments[0].click();", CategoryOption);
		
		
	}
	public void SetSensorType(String SensorName) {
		SensorType.sendKeys(SensorName);
	}
	public void SetVideoResolution(String Video) {
		VideoResolution.sendKeys(Video);
	}
	public void SetConnectivity(String ConnectivityData) {
		Connectivity.sendKeys(ConnectivityData);
		
		
	}
	public void selectCity() throws InterruptedException {
		City.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", CityOption);
		
	}
	public void SelectEquipments() {
		SelectEquipment.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("arguments[0].click();", EquipmentOptions);
		}
	public void SetFeature(String Features) {
		
		Select sc=new Select(Feature);
		sc.selectByValue("Sowa Town Council");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	    js.executeScript("arguments[0].click();", Feature);
//	    
//	    Feature.sendKeys(Features);
////		Feature.sendKeys(Features);
	}
	public void SetSpecifications(String Specific) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", Specifications);
		Specifications.sendKeys(Specific);
	}
	
	public void SetMRP1(String mrp1) throws InterruptedException {
		
		MRP1.sendKeys(mrp1);
		
	}
	public void SetSellingPrice(String sellingprice1) {

	SellingPrice1.sendKeys(sellingprice1);
	
	}
	public void SetMRP2(String mrp2) {
		MRP2.sendKeys(mrp2);
	}
	public void SetSellingPrice2(String sellingprice2) {

	SellingPrice2.sendKeys(sellingprice2);
	
	}
	public void SetMRP3(String mrp3) {
		MRP3.sendKeys(mrp3);
	}
	public void SetSellingPrice3(String sellingprice3) {

	SellingPrice3.sendKeys(sellingprice3);
	
	}
	public void SetMRP4(String mrp4) {
		MRP4.sendKeys(mrp4);
	}
	public void SetSellingPrice4(String sellingprice4) throws InterruptedException {

	SellingPrice4.sendKeys(sellingprice4);

	
	}
	public void SetMRP5(String mrp5) {
		MRP5.sendKeys(mrp5);
	}
	public void SetSellingPrice5(String sellingprice5) {

	SellingPrice5.sendKeys(sellingprice5);
	
	}
	public void SetMRP6(String mrp6) {
		MRP6.sendKeys(mrp6);
	}
	public void SetSellingPrice6(String sellingprice6) {

	SellingPrice6.sendKeys(sellingprice6);
	
	}
	
	public void SetTax(String tax) {
		Tax.sendKeys(tax);
	}
	public void setLet(String lat) {
	Lat.sendKeys(lat);
	}
	public void setLong(String longtitude) {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", Long);
	        js.executeScript("arguments[0].click();", Long);
		Long.sendKeys(longtitude);
	}
	public void SetShortDescription(String shortdescription) {
		ShortDescription.sendKeys(shortdescription);
	}
	public void SetLongDescription(String longdescription) {
		LongDescription.sendKeys(longdescription);
	}
	public void ClickSaveButton() {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", SaveButton);
	        js.executeScript("arguments[0].click();", SaveButton);
	
	}
	
	
}



	
	
	
	
	
	
	
	
	
	
	





