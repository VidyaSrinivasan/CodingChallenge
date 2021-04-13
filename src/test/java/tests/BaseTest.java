package tests;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import core.DriverFactory;



public class BaseTest {
	
	private WebDriver driver;
	private DriverFactory df;
	
	private String browser = "chrome";

	

	
	@BeforeClass()
	public void initClass() {
		df = new DriverFactory();
		driver = df.getDriver(browser);
	}
	
	@AfterClass()
	public void tearDown() {
		df.quitDriver();
	}
	

	@BeforeMethod()
	public void launchApp() {
		driver.get("https://qa.employeenavigator.com/benefits/Account/Login");
	}
	
	
	public WebDriver driver() {
		return driver;
	}
}
