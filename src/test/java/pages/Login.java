package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login extends BasePage{

	public Login(WebDriver driver) {
		super(driver);
		
	}

	private static String broker_username="automationuser";
	private static String broker_password="Automation1!";

	@FindBy(xpath="//input[@id='Username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement password;

	@FindBy(xpath="//input[@id='btn_login']")
	private WebElement loginbtn;
	

	
	public void brokerLogin()
	{
		new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOf(username)).sendKeys(broker_username);
		new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOf(password)).sendKeys(broker_password);
		new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOf(loginbtn)).click();
	}
	
}
