package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
	
	public static void main(String[] args) {
		GoogleSearch();
		
		
	}
	
	public static void GoogleSearch(){
		String Projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Projectpath+"/Drivers/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}

}
