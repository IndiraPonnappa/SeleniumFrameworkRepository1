package listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.AmazonSearchPage;


public class TestNGListenersDemo {
	@Test	
	public void test1(){
		System.out.println("I am inside test1");
	}
	@Test	
	public void test2(){
		System.out.println("I am inside test1");
		String Projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Projectpath+"/Drivers/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		AmazonSearchPage.textbox_Search1(driver).sendKeys("Womens Fashion");
		AmazonSearchPage.button_Search(driver).click();
		driver.close();
	}
	@Test	
	public void test3(){
		System.out.println("I am inside test1");
		throw new SkipException("This test is skipped");
	}

}
