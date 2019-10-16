package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class ExcelDataProvider {
	 WebDriver driver= null;
	 
	@BeforeTest
	public void SetupTest(){

		String Projectpath=System.getProperty("user.dir");
				
			System.setProperty("webdriver.chrome.driver", Projectpath+"/Drivers/Chromedriver/chromedriver.exe");
			driver = new ChromeDriver();

		}
	@Test(dataProvider="test1data")
	public void test1(String Username,String Password) throws Exception{
		System.out.println(Username +" | "+Password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		Thread.sleep(2000);
	}


	@DataProvider (name="test1data")
	public   Object[][] getData(){
		String excelPath="C:/Users/91897/Training/SeleniumFramework/Excel/data.xlsx";
		Object data[][]=testData(excelPath, "Sheet1");
		return data;
	}

	public  Object[][] testData(String excelPath,String sheetName ){

		ExcelUtils excel= new ExcelUtils(excelPath, sheetName);

		int rowCount=excel.getRowCount();
		int colCount=excel.getcolCount();

		Object data[][]= new Object[rowCount-1][colCount];

		for (int i=1;i<rowCount;i++){
			for (int j=0;j<colCount;j++){
				String cellData=excel.getCellDataString(i, j);
				System.out.print(cellData+ "  ");
				data[i-1][j]=cellData;
			}
			System.out.println();
		}

		return data;
	}
}