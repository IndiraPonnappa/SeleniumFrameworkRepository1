package testNGPriority;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitsDemo {
	
	public static void main(String[] args) {
		seleniumWaits();
		
	}
	
	public static void seleniumWaits(){
		String Projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Projectpath+"/Drivers/Chromedriver/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		/*Explict Wait*/
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		driver.findElement(By.name("abcd")).click();
		driver.close();
		driver.quit();
	}

}
