package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.AmazonSearchPage;

public class ExtentReportsBasicDemo {
	static WebDriver driver = null;

	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test2 = extent.createTest("AmazonSearch", "Test to validate Amazon search text box");

		String Projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Projectpath+"/Drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		test2.log(Status.INFO, "Starting the test case");

		driver.get("https://www.amazon.in/");
		test2.pass("Navigated to Amazon webpage");

		driver .findElement(By.id("twotabsearchtextbox")).sendKeys("Womens Fashion");
		test2.pass("Entered text in the search box");

		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		test2.pass("Clicked on the search button");

		driver.close();
		driver.quit();
		test2.pass("Closed the browser session");
		test2.info("Test completed successfully");
		
		 // calling flush writes everything to the log file
        extent.flush();


	}

}
