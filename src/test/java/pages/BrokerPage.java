package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class BrokerPage extends BasePage{
	
	public BrokerPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@class='company-list-active form-control']") //company Dropdown
	private WebElement company;
	
	//Select company dropdown 
	public void selectCompany(String companyName)
	{
		BasePage.waitUntilElementIsVisible(driver, company, 2);
		Select companydropdown = new Select(company);
		companydropdown.selectByVisibleText(companyName);
	}

	
}
