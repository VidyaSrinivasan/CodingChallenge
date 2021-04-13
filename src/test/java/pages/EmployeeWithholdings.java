package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeWithholdings extends BasePage{
	
	public EmployeeWithholdings(WebDriver driver) {
		super(driver);
		
	}

	public void federalWithholdings(String fieldName)
	{
		String value="";
		String text= driver.findElement(By.xpath("//label[text()='"+fieldName+"']//ancestor::div[@class='col-md-6']")).getText();
		 String[] segment = text.split("\\n");
		 
		 if(segment.length>1)
		 {
			 value=segment[segment.length-1];
		 }
		 
		 System.out.println(value);
	}
	
	public void stateWithholdings(String fieldName)
	{
		String text = driver.findElement(By.xpath("//label[text()='"+fieldName+"']//following-sibling::span")).getText();
		System.out.println(text);
	}
	
	public void stateSpecificFields(String fieldName)
	{
		String text = driver.findElement(By.xpath("//td[text()='"+fieldName+"']/following-sibling::td")).getText();
		System.out.println(text);
	}

}
