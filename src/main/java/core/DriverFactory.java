package core;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	private WebDriver driver;
	
	public WebDriver getDriver(String browserName) {
			
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasanna\\Desktop\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}else if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Prasanna\\Desktop\\geckodriver.exe");
				
				driver = new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		
		// One time configuration to handle sync issues
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS); // before throwing TimeOutException
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // before throwing NoSuchElementException 
		
		return driver;
	}
	
	public void quitDriver() {
		if(driver!=null) {
			driver.quit();
		}
	}

}
