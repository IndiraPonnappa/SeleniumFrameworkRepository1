package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo_AmazonSearch2 {

	static WebDriver driver= null;

	@BeforeTest
	public void SetupTest(){
		String Projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Projectpath+"/Drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

	}
	@Test
	public static void AmazonSearch2(){

		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
	}
	@Test
	public static void AmazonSearch3(){

		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[contains(text(),'Best Sellers')]")).click();
	}
	@AfterTest
	public static void EndTest(){
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}
}
