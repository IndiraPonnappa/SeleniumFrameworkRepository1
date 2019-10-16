package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSearchObjects {
	WebDriver driver= null;
	
	By textbox_Search= By.id("twotabsearchtextbox");
	By Button_Search=By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
	By Categories_button= By.xpath("//i[@class='hm-icon nav-sprite']");
	public AmazonSearchObjects(WebDriver driver){
		this.driver=driver;
	}
	
	public void setTextinSearchBox(String text){
		driver.findElement(textbox_Search).sendKeys(text);
	}
	
	public void clickOnSearchButton(){
		driver.findElement(Button_Search).click();
	}
	
	public void ClickOnCategoriesButton(){
		driver.findElement(Categories_button).click();
	}

}
