package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemoWithTestNG {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver=null;

	@BeforeSuite
	public void setUp(){
		htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);


	}
	@BeforeTest
	public void setUpTest()
	{
		String Projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Projectpath+"/Drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void test1() throws Exception{
		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test2 = extent.createTest("AmazonSearch", "Test to validate Amazon search text box");
		driver.get("https://www.amazon.in/");
		test2.pass("Navigated to Amazon webpage");
		
		driver .findElement(By.id("twotabsearchtextbox")).sendKeys("Womens Fashion");
		test2.pass("Entered text in the search box");

		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		test2.pass("Clicked on the search button");

		// log(Status, details)
		test2.log(Status.INFO, "This step shows usage of log(status, details)");

		// info(details)
		test2.info("This step shows usage of info(details)");

		// log with snapshot
		test2.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

	}
	@AfterTest
	public void teardowntest(){
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
	@AfterSuite
	public void teardown(){
		// calling flush writes everything to the log file
		extent.flush();

	}
}
