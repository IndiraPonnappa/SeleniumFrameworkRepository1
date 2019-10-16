package testNGPriority;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	public static void main(String[] args) {
		test();
	}
	
	public static void test(){
		
		String ProjectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath+"/Drivers/Chromedriver/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("Headless");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.getTitle();
		driver.close();
		driver.quit();
		System.out.println("Test completed");
	}

}
