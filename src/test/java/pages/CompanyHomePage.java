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

@FindBy(xpath="//a[@class='site-header-logo-link']")
private WebElement companyTitle;

@FindBy(xpath="//input[@class='typeahead typeahead-container form-control tt-input']")
private WebElement EESearchTextbox;

@FindBy(xpath="//div[@class='tt-dataset tt-dataset-employees']/div")
private WebElement EETypeaheadSelection;

public void navigateToEmployeeManagement(String lastName) throws InterruptedException
{
	new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOf(EESearchTextbox)).sendKeys(lastName);
	new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOf(EETypeaheadSelection)).click();
	
}

public String returnCompanyTitle() throws InterruptedException
{
	new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOf(companyTitle));
	return companyTitle.getAttribute("title");
}

}
