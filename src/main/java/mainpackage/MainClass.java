package mainpackage;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MainClass {
	public	static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	@BeforeTest
	public void chromeLaunch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.guardiandirect.com/");
		driver.manage().window().maximize();
		extent = new ExtentReports(System.getProperty("user.dir") + "/testoutput/report/"+".html");
	}
	
	@AfterTest
	public void chromeclose()
	{
		driver.close();
		extent.flush();
		extent.close();
		}
	
	@AfterMethod
 	public void getResult(ITestResult result) throws Exception{

	
	if(result.getStatus() == ITestResult.FAILURE){

	logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
	logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
	String screenshotPath = getScreenshot(driver, result.getName());
	//To add it in the extent report
	logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
	}else if(result.getStatus() == ITestResult.SKIP){
	logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
	}else if(result.getStatus() == ITestResult.SUCCESS){
	logger.log(LogStatus.PASS, "Test Case Passed is "+result.getName());
	//logger.log(LogStatus.PASS, "Test Case Passed is "+result.getThrowable());
	String screenshotPath = getScreenshot(driver, result.getName());
	//To add it in the extent report
	logger.log(LogStatus.PASS, logger.addScreenCapture(screenshotPath));
	}
	extent.endTest(logger);
 	}

	public static String  getScreenshot(WebDriver driver, String screenshotName) throws Exception {
	String dateName = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	//after execution, you could see a folder "FailedTestsScreenshots" under src folder
	String destination = System.getProperty("user.dir") + "/src/test/testoutput/"+screenshotName+dateName+".png";
	File finalDestination = new File(destination);
	System.out.println(destination);
	FileUtils.copyFile(source, finalDestination);
	return destination;
	}
	
	
	
	
	
	
	
	
}
