package testNGPriority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultipleBrowserDemo {
	WebDriver driver=null;
	String Projectpath=System.getProperty("user.dir");

	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName){
		System.out.println("The browser is :"+browserName);
		System.out.println("the thread id is:"+Thread.currentThread().getId());
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", Projectpath+"/Drivers/Chromedriver/chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if (browserName.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", Projectpath+"/Drivers/GeckoDriver/geckodriver.exe");
			driver = new FirefoxDriver();

		}
		//else if (browserName.equalsIgnoreCase("ie")){
			//System.setProperty("webdriver.IE.Driver",Projectpath+"/Drivers/InternetExplorer/IEDriverServer.exe");
			// driver=new InternetExplorerDriver();

		//}

	}
	@Test
	public void test1(){

		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Womens Fashion");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();

	}
	@AfterTest
	public void tearDown(){
		driver.close();

	}


}
