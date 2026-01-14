package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testbase.BaseMethods;

public class BlogPost extends BaseMethods{
	
//	public BlogPost(WebDriver driver) {
//		super(driver);
//	}
	
	@FindBy(xpath="//a[normalize-space()='Add new post']")WebElement AddPost;

}
