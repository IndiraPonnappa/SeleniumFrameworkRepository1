package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonSearchPage;

import pages.AmazonSearchPage;

public class Test2_AmazonSearch {
	static WebDriver driver =null;
	public static void main(String[] args) {

		AmazonSearch();
	}
	public static void AmazonSearch(){
		String Projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Projectpath+"/Drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		AmazonSearchPage.textbox_Search1(driver).sendKeys("Womens Fashion");
		AmazonSearchPage.button_Search(driver).click();

	}

}
