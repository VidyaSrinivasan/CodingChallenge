package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EmployeeManagement extends BasePage {
	
	
	@FindBy(xpath="//h2[@class='nomargin inline text-success']")
	private WebElement EEname;
	
	public EmployeeManagement(WebDriver driver) {
		super(driver);
	}
	
	public String returnEEname() throws InterruptedException
	{
		Thread.sleep(2000);
		return EEname.getText();
	}
	
	public void navigateToEmployeeTabs(String tabName) throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='"+tabName+"']")).click();
		Thread.sleep(2000);
	}

	public void navigateToProfileLeftNav(String linkName) throws InterruptedException
	{
		driver.findElement(By.xpath("//span[contains(text(),'"+linkName+"')]")).click();
		Thread.sleep(2000);
	}
}
