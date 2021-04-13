package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class EmployeeManagement extends BasePage {
	
	
	@FindBy(xpath="//h2[@class='nomargin inline text-success']")
	private WebElement EEname;
	
	public EmployeeManagement(WebDriver driver) {
		super(driver);
	}
	
	public String returnEEname() 
	{
		new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOf(EEname));
		return EEname.getText();
	}
	
	public void navigateToEmployeeTabs(String tabName) 
	{
		new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='"+tabName+"']")))).click();
		//driver.findElement(By.xpath("//a[text()='"+tabName+"']")).click();
		
	}

	public void navigateToProfileLeftNav(String linkName) throws InterruptedException
	{
		new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(),'"+linkName+"')]")))).click();
		//driver.findElement(By.xpath("//span[contains(text(),'"+linkName+"')]")).click();
		
	}
}
