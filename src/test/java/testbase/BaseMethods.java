//package testbase;
//
//import java.io.File;
//import java.nio.file.StandardCopyOption;
//import java.text.SimpleDateFormat;
//import java.time.Duration;
//import java.util.Date;
//
////import java.io.File;
////import java.text.SimpleDateFormat;
////import java.util.Date;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
////import org.openqa.selenium.OutputType;
////import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.google.common.io.Files;
//
//public class BaseMethods {
//	public static WebDriver driver;    // static we have did because it is calling in the extent report also......  and making this driver common for all....
//	public WebDriver wait;
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	
//	public BaseMethods(WebDriver driver) {
//		
//		this.driver=driver;	
//		PageFactory.initElements(driver, this);
//	}
//	
//   public String captureScreen(String tname) {
//	    if (driver == null) {
//	        System.out.println("Error: WebDriver is null. Cannot take screenshot.");
//	        return null; // Prevents NullPointerException
//	    }
//
//	    try {
//	        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//	        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
//	        File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//
//	        // Ensure the screenshot directory exists
//	        String screenshotDir = System.getProperty("user.dir") + "/screenshots/";
//	        File directory = new File(screenshotDir);
//	        if (!directory.exists()) {
//	            directory.mkdirs(); // Create the directory if it doesn't exist
//	        }
//
//	        // Save screenshot
//	        String targetFilePath = screenshotDir + tname + "_" + timeStamp + ".png";
//	        File targetFile = new File(targetFilePath);
//	        Files.copy(sourceFile, targetFile); // Use Guava to copy the file
//
//	        return targetFilePath; // Return the valid file path
//
//	    } catch (Exception e) {
//	        System.out.println("Error capturing screenshot: " + e.getMessage());
//	        return null;
//	    }
//	}
//	
//	
//	  public static WebDriver getDriver() {
//		    if (driver == null) {
//		        System.out.println("Warning: WebDriver is null.");
//		    }
//		    return driver;
//		}
//
//
//
//
//}

package testbase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class BaseMethods {

    // Static driver (Extent Report + common access)
    public static WebDriver driver;

    protected WebDriverWait wait;
    protected JavascriptExecutor js;

    // 🔥 DRIVER + HEADLESS INITIALIZATION YAHAN ADD KIYA
    public BaseMethods() {
        if (driver == null) {

            ChromeOptions options = new ChromeOptions();

            // ✅ HEADLESS CONFIG (CI/CD READY)
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--window-size=1920,1080");

            driver = new ChromeDriver(options);
        }

        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;

        PageFactory.initElements(driver, this);
    }

    // 🔁 Constructor for PageObjects (driver reuse)
    public BaseMethods(WebDriver driver) {
        BaseMethods.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
    }

    // 📸 Screenshot utility
    public String captureScreen(String tname) {

        if (driver == null) {
            System.out.println("Error: WebDriver is null. Cannot take screenshot.");
            return null;
        }

        try {
            String timeStamp =
                    new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            String screenshotDir =
                    System.getProperty("user.dir") + "/screenshots/";
            File directory = new File(screenshotDir);

            if (!directory.exists()) {
                directory.mkdirs();
            }

            String targetPath =
                    screenshotDir + tname + "_" + timeStamp + ".png";

            File targetFile = new File(targetPath);
            Files.copy(source, targetFile);

            return targetPath;

        } catch (Exception e) {
            System.out.println("Error capturing screenshot: " + e.getMessage());
            return null;
        }
    }

    // 🔑 For Extent / listeners
    public static WebDriver getDriver() {
        return driver;
    }
}

