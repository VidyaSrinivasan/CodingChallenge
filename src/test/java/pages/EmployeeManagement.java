package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EmployeeManagement extends BasePage {
	
	
	@FindBy(xpath="//h2[@class='nomargin inline text-success']") //EE name label
	private WebElement EEname;
	

	
	public EmployeeManagement(WebDriver driver) {
		super(driver);
	}
	
	//Getting name of EE on Employee management page
	public String returnEEname() 
	{
		return BasePage.waitUntilElementIsVisible(driver, EEname, 2).getText();
	}
	
	//Common method to navigate to any of the tabs on EE management page
	public void navigateToEmployeeTabs(String tabName) 
	{
		WebElement EETab = driver.findElement(By.xpath("//a[text()='"+tabName+"']"));
		BasePage.waitUntilElementIsVisible(driver, EETab, 2).click();	
		
	}

	//Common method to navigate to any of the left nav links on the Profile page
	public void navigateToProfileLeftNav(String linkName) throws InterruptedException
	{
		WebElement EELeftNavLink = driver.findElement(By.xpath("//span[contains(text(),'"+linkName+"')]"));
		BasePage.waitUntilElementIsVisible(driver, EELeftNavLink, 2).click();
		
		
		
	}
}
