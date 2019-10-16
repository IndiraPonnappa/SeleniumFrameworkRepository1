import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	public static void main(String[] args) {
		String Projectpath=System.getProperty("user.dir");
		System.out.println("Projectpath" +Projectpath);
		//System.setProperty("webdriver.gecko.driver", Projectpath+"\\Drivers\\GeckoDriver\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", Projectpath+"/Drivers/Chromedriver/chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.IE.Driver",Projectpath+"/Drivers/InternetExplorer/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.seleniumhq.org");
		//driver.close();
		
	}

}
