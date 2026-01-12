//package utilities;
//
//import java.awt.Desktop;
//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//import testbase.BaseMethods;
//
//
//
//
//
//public class ExtentReportManager implements ITestListener {
//	public ExtentSparkReporter sparkReporter;  //  UI of the Report
//	public ExtentReports extent;              // populate common Information on the report
//	public ExtentTest test;                  // creating test cases entries in the reports and update status of the test methods
//    
//	String repName;
//	
//	public void onStart(ITestContext context) {
//		
//		/*SimpleDateFormat df=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
//		Date dt=new Date();
//		String currentDateTimeStamp=df.format(dt);
//		*/
//		
//		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
//		repName="Test-Report-"+timeStamp+".html";
//		
////		sparkReporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/reports"+repName);
//		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/" + repName);
//		sparkReporter.config().setDocumentTitle("Automation Report");  // Title of Report
//		sparkReporter.config().setReportName("Functional Testing");    // Name of Report
//		sparkReporter.config().setTheme(Theme.DARK);
//		
//		extent =new ExtentReports();
//		extent.attachReporter(sparkReporter);         //Combined the UI ans Populated Information
//		extent.setSystemInfo("Computer Name", "localHost");
//		extent.setSystemInfo("Environment", "QA");
//		extent.setSystemInfo("Tester Name",System.getProperty("user.name"));
//		String os=context.getCurrentXmlTest().getParameter("os");
//		extent.setSystemInfo("Operating System", os);
//		
//		String browser= context.getCurrentXmlTest().getParameter("browser");
//		extent.setSystemInfo("Browser", browser);
////		extent.setSystemInfo("OS", "Windows 11");
////		extent.setSystemInfo("Browser Name", "Chrome");	
//		
//		List<String>includeGroups=context.getCurrentXmlTest().getIncludedGroups();
//		if(!includeGroups.isEmpty()) {
//			extent.setSystemInfo("Groups", includeGroups.toString());
//		}
//		
//		
//		
//	}
//	
//	public void onTestSuccess(ITestResult result) {
//		test=extent.createTest(result.getTestClass().getName());  // create a new entry in the rport
//		test.assignCategory(result.getMethod().getGroups());    //to display groups in reports.....
//		test.log(Status.PASS, "Test Case Passed is: "+result.getName());  // Update status pass/fail/skip
//	}
//	public void onTestFailure(ITestResult result) {
//		test=extent.createTest(result.getTestClass().getName());
//		test.assignCategory(result.getMethod().getGroups());  
//		test.log(Status.FAIL, "Test Case Get Failed"+result.getName());
//		test.log(Status.INFO, "Test Case Failed Due To:"+result.getThrowable());
//		
//		
//		
//		String imgPath=new BaseMethods(null).captureScreen(result.getName());
//		test.addScreenCaptureFromPath(imgPath);
//		
//	}
//	public void onTestSkipped(ITestResult result) {
//	test=extent.createTest(result.getName());
//	test.log(Status.SKIP, "Test Case is Skipped"+ result.getName());
//	}
//	
//	public void onFinish(ITestContext context) {
//		extent.flush();
//		String pathOfExtentReport=System.getProperty("user.dir")+"\\reports\\"+repName;
//		File extentReport=new File(pathOfExtentReport);
//		try {
//			Desktop.getDesktop().browse(extentReport.toURI());
//		} catch(IOException e){
//			e.printStackTrace();
//		}
//		
//	}
//	)
//	}

package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testbase.BaseMethods;

public class ExtentReportManager implements ITestListener {
    public ExtentSparkReporter sparkReporter;
    public ExtentReports extent;
    public ExtentTest test;

    String repName;

    public void onStart(ITestContext context) {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        repName = "Test-Report-" + timeStamp + ".html";

        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/" + repName);
        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("Functional Testing");
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Computer Name", "localHost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester Name", System.getProperty("user.name"));

        String os = context.getCurrentXmlTest().getParameter("os");
        extent.setSystemInfo("Operating System", os);

        String browser = context.getCurrentXmlTest().getParameter("browser");
        extent.setSystemInfo("Browser", browser);

        List<String> includeGroups = context.getCurrentXmlTest().getIncludedGroups();
        if (!includeGroups.isEmpty()) {
            extent.setSystemInfo("Groups", includeGroups.toString());
        }
    }

    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.PASS, "Test Case Passed: " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        test = extent.createTest(result.getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.FAIL, "Test Case Failed: " + result.getName());
        test.log(Status.INFO, "Failure Reason: " + result.getThrowable());

        WebDriver driver = BaseMethods.getDriver(); // Ensure BaseMethods provides a valid WebDriver instance
        String imgPath = new BaseMethods(driver).captureScreen(result.getName());
        test.addScreenCaptureFromPath(imgPath);
    }

    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.SKIP, "Test Case Skipped: " + result.getName());
    }

    public void onFinish(ITestContext context) {
        extent.flush();
        String pathOfExtentReport = System.getProperty("user.dir") + "/reports/" + repName;
        File extentReport = new File(pathOfExtentReport);
        try {
            Desktop.getDesktop().browse(extentReport.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
