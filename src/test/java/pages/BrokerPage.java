package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BrokerPage extends BasePage{
	
	public BrokerPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@class='company-list-active form-control']")
	private WebElement company;
	
	public void selectCompany(String companyName)
	{
		new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOf(company));
		Select companydropdown = new Select(company);
		companydropdown.selectByVisibleText(companyName);
	}

	
}
