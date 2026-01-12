//package testcases;
//
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import pageobjects.AddBlog;
//import utilities.Dataprovider;
//
//public class BlogTestCases extends SetupMethod{
//	@Test(dataProvider="LoginData",dataProviderClass = Dataprovider.class)
//	public void BlogTestCases(String Email, String Password, String Name) throws InterruptedException {
//		AddBlog ab=new AddBlog(driver);
//		ab.logIn(Email);
//		ab.Setpassword(Password);
//		ab.Login();
//		Thread.sleep(4000);
//		ab.clickBlog();
//		
//		ab.clickTags();
//		Thread.sleep(2000);
//		ab.clickBlogTag();
//		ab.setTagName(Name);
//		ab.clickonSaveButton();
//	}
//}
//
//






package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.AddBlog;
import pageobjects.Login;
import utilities.Dataprovider;

public class BlogTestCases extends SetupMethod {
//    private String email = "shivam@gmail.com";
//    private String password = "12345678";

    // Ensure login is successful before any test case runs
   @Test(priority=1, dataProvider="LoginData",dataProviderClass=Dataprovider.class)
    public void loginToApplication(String Email, String Password, String Name) throws InterruptedException {
        AddBlog ab = new AddBlog(driver);
        ab.logIn(Email);       // Hardcoded email
        ab.Setpassword(Password);   // Hardcoded password
        ab.Login();

        // Assert that login is successful by checking if the dashboard page loads
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Dashboard"), "Login failed. Dashboard not found.");
    }
	
	
	
	
	

    // Test case to add a new blog tag
    @Test(priority=2, dataProvider = "LoginData", dataProviderClass = Dataprovider.class,groups="login")
    public void addNewBlogTag(String Email, String Password, String Name) throws InterruptedException {
    	
        AddBlog ab = new AddBlog(driver);
      
        ab.clickBlog();          // Click on Blogs
        ab.clickTags();          // Click on Tags
        ab.clickBlogTag();       // Click on Add New Blog Tag
        ab.setTagName(Name);     // Set the tag name from the data provider
        ab.clickonSaveButton();  // Click on Save button
    }
}

