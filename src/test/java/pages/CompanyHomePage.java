package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompanyHomePage extends BasePage{

public CompanyHomePage(WebDriver driver) {
		super(driver);
	}

@FindBy(xpath="//a[@class='site-header-logo-link']") //company title
private WebElement companyTitle;

@FindBy(xpath="//input[@class='typeahead typeahead-container form-control tt-input']") //EE search box
private WebElement EESearchTextbox;

@FindBy(xpath="//div[@class='tt-dataset tt-dataset-employees']") //Type ahead search results
private WebElement EETypeaheadSelection;

//Search for an EE and navigate to EE management page
public void navigateToEmployeeManagement(String lastName) throws InterruptedException
{
	BasePage.waitUntilElementIsVisible(driver, EESearchTextbox, 2).sendKeys(lastName);
	BasePage.waitUntilElementIsVisible(driver, EETypeaheadSelection, 2).click();
	
}

public String returnCompanyTitle() 
{
	return BasePage.waitUntilElementIsVisible(driver, companyTitle, 2).getAttribute("title");
}

}
