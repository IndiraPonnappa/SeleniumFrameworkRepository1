package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNGDemo_AmazonSearch {

	static WebDriver driver= null;
	public static String Browsername=null;

	@BeforeTest
	public void SetupTest(){

		String Projectpath=System.getProperty("user.dir");
		PropertiesFile.getProperties();
		if(Browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", Projectpath+"/Drivers/Chromedriver/chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if (Browsername.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", Projectpath+"/Drivers/GeckoDriver/geckodriver.exe");
			driver = new FirefoxDriver();

		}

	}
	@Test
	public static void AmazonSearch(){

		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Womens Fashion");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
	}
	@AfterTest
	public static void EndTest(){
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
}
