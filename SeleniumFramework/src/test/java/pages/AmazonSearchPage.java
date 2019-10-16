package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchPage {

	static WebElement element= null;

	public static WebElement textbox_Search1 (WebDriver driver){

		element= driver .findElement(By.id("twotabsearchtextbox"));
		return element;

	}
	public static WebElement button_Search (WebDriver driver){
		element= driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']"));
		return element;
	}
	

}
