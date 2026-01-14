//package pageobjects;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//import testbase.BaseMethods;
//
//public class AddBlog extends BaseMethods {
//	public AddBlog(WebDriver driver) {
//		super(driver);
//	}
//	
//	@FindBy(xpath="//input[@placeholder='Email']") WebElement email;
//	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
//	@FindBy(xpath="//button[normalize-space()='Login']") WebElement Login;
//	@FindBy(xpath="//span[normalize-space()='Blogs']") WebElement Blog;
//	@FindBy(xpath="//a[normalize-space()='Tags']")WebElement Tags;
//	@FindBy(xpath="//button[normalize-space()='Add New Blog Tag']")WebElement BlogTag;
//	@FindBy(xpath="//input[@name='name']")WebElement TagName;
//	@FindBy(xpath="//button[normalize-space()='Save']")WebElement SaveButton;
//	
//	
//	
//	public void logIn(String Email) throws InterruptedException {
//	    email.click();
//        email.clear();
//      
//        email.sendKeys(Email);	 	
//}
//	public void Setpassword(String pwd) {
//		password.clear();
//		password.sendKeys(pwd);
//		
//}
//	public void Login() {
//		Login.click();
//		
//	}
//	public void clickBlog() {
//		Blog.click();
//	}
//	public void clickTags() {
//		Tags.click();
//	}
//	public void clickBlogTag() {
//		BlogTag.click();
//	}
//	
//	public void setTagName(String Name) {
//		TagName.sendKeys(Name);
//	}
//	public void clickonSaveButton() {
//		SaveButton.click();
//	}
//	
//	
//
//}







package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import testbase.BaseMethods;

public class AddBlog extends BaseMethods {
//    public AddBlog(WebDriver driver) {
//        super(driver);
//        
//    }

    // WebElements for login
    @FindBy(xpath = "//input[@placeholder='Email']") WebElement email;
    @FindBy(xpath = "//input[@placeholder='Password']") WebElement password;
    @FindBy(xpath = "//button[normalize-space()='Login']") WebElement Login;

    // WebElements for adding a blog tag
    @FindBy(xpath = "//span[normalize-space()='Blogs']") WebElement Blog;
    @FindBy(xpath = "//a[normalize-space()='Tags']") WebElement Tags;
    @FindBy(xpath = "//button[normalize-space()='Add New Blog Tag']") WebElement BlogTag;
    @FindBy(xpath = "//input[@name='name']") WebElement TagName;
    @FindBy(xpath = "//button[normalize-space()='Save']") WebElement SaveButton;

    // Login function
    public void logIn(String Email) {
        email.clear();
        email.sendKeys(Email);
    }

    public void Setpassword(String pwd) {
        password.clear();
        password.sendKeys(pwd);
    }

    public void Login() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(Login)).click();
    }

    // Click on Blogs and Tags
    public void clickBlog() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(Blog)).click();
    }

    public void clickTags() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(Tags)).click();
    }

    // Add new blog tag
    public void clickBlogTag() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(BlogTag)).click();
    }

    public void setTagName(String Name) {
        TagName.clear();
        TagName.sendKeys(Name);
    }

    public void clickonSaveButton() {
        SaveButton.click();
    }
}

