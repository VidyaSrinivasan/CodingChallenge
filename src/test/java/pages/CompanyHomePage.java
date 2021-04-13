package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyHomePage extends BasePage{

public CompanyHomePage(WebDriver driver) {
		super(driver);
	}

@FindBy(xpath="//a[@class='site-header-logo-link']")
private WebElement companyTitle;

@FindBy(xpath="//input[@class='typeahead typeahead-container form-control tt-input']")
private WebElement EESearchTextbox;

@FindBy(xpath="//div[@class='tt-dataset tt-dataset-employees']/div")
private WebElement EETypeaheadSelection;

public void navigateToEmployeeManagement(String lastName) throws InterruptedException
{
	Thread.sleep(2000);
	EESearchTextbox.sendKeys(lastName);
	Thread.sleep(2000);
	EETypeaheadSelection.click();
}

public String returnCompanyTitle() throws InterruptedException
{
	Thread.sleep(2000);
	return companyTitle.getAttribute("title");
}

}
