package testNGPriority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItDemo {
	
	public static void main(String[] args) throws Exception {
		test();
		
	}
	
	public static void test() throws Exception{
		String ProjectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath+"/Drivers/Chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.tinyupload.com/");
		driver.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("C:/Users/91897/Desktop/FileUploadScript.exe");
		Thread.sleep(3000);
		driver.close();

	}


}
