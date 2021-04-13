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

	public void federalWithholdings(String fieldName)
	{
		String value="";
		WebElement federalWithholdingField = driver.findElement(By.xpath("//label[text()='"+fieldName+"']//ancestor::div[@class='col-md-6']"));
		new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOf(federalWithholdingField));
		String text= federalWithholdingField.getText();
		 String[] segment = text.split("\\n");
		 
		 if(segment.length>1)
		 {
			 value=segment[segment.length-1];
		 }
		 
		 System.out.println(value);
	}
	
	public void stateWithholdings(String fieldName)
	
	{
		
		WebElement stateWithholdingField = driver.findElement(By.xpath("//label[text()='"+fieldName+"']//following-sibling::span"));
		new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOf(stateWithholdingField));
		String text = stateWithholdingField.getText();
		System.out.println(text);
	}
	
	public void stateSpecificFields(String fieldName)
	{
		WebElement stateSpecificField = driver.findElement(By.xpath("//td[text()='"+fieldName+"']/following-sibling::td"));
		new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOf(stateSpecificField));
		String text = stateSpecificField.getText();
		System.out.println(text);
	}

}
