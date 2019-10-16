package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonSearchObjects;

public class AmazonSearchPageObjectTest {
	static WebDriver driver=null;
	public static void main(String[] args) {
		AmazonSearchPage();

	}

	public static void AmazonSearchPage(){
		String Projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Projectpath+"/Drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		AmazonSearchObjects SearchpageObjects= new AmazonSearchObjects(driver);
		driver.get("https://www.amazon.in/");
		SearchpageObjects.setTextinSearchBox("Womens Fashion");
		SearchpageObjects.clickOnSearchButton();
		SearchpageObjects.ClickOnCategoriesButton();
	}

}
