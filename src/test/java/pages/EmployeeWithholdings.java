package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeeWithholdings extends BasePage{
	
	public EmployeeWithholdings(WebDriver driver) {
		super(driver);
		
	}

	//Common method to print Federal withholding field values
	public void federalWithholdings(String fieldName)
	{
		String value="";
		WebElement federalWithholdingField = driver.findElement(By.xpath("//label[text()='"+fieldName+"']//ancestor::div[@class='col-md-6']"));
		
		String text = BasePage.waitUntilElementIsVisible(driver, federalWithholdingField, 2).getText();
		
		String[] segment = text.split("\\n");
		 
		 if(segment.length>1)
		 {
			 value=segment[segment.length-1];
		 }
		 
		 System.out.println(value);
	}
	
	//Common method to print state withholding field values
	public void stateWithholdings(String fieldName)
	
	{
		
		WebElement stateWithholdingField = driver.findElement(By.xpath("//label[text()='"+fieldName+"']//following-sibling::span"));
		String text = BasePage.waitUntilElementIsVisible(driver, stateWithholdingField, 2).getText();
		System.out.println(text);
	}
	
	//Common method to print state specific field values
	public void stateSpecificFields(String fieldName)
	{
		WebElement stateSpecificField = driver.findElement(By.xpath("//td[text()='"+fieldName+"']/following-sibling::td"));
		String text = BasePage.waitUntilElementIsVisible(driver, stateSpecificField, 2).getText();
		System.out.println(text);
	}

}
