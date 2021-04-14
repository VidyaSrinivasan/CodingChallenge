package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BrokerPage;
import pages.CompanyHomePage;
import pages.EmployeeManagement;
import pages.EmployeeWithholdings;
import pages.Login;

public class EmployeeWithholdingsTest extends BaseTest{
	
	Login l = null;
	BrokerPage bp = null;
	CompanyHomePage chp =null;
	EmployeeManagement em = null;
	EmployeeWithholdings ew =null;
	
	String EELastName ="AutomationTest";
	String EEFirstName="Emp";
	
	String companyName = "Automation Company";
	
	@Test()
	
	public void verifyEmployeeWithholdingData() throws InterruptedException 
	{
		//Login as broker user
		l = new Login(driver());
		l.brokerLogin(); 
		
		//Pick a company from the Company dropdown on broker home page
		bp = new BrokerPage(driver());
		bp.selectCompany(companyName);
		
		//Search for an Employee and navigate to Employee Management page
		chp = new CompanyHomePage(driver());
		
		//Verify company's home page is loaded
		String companyTitle = chp.returnCompanyTitle();
		Assert.assertEquals(companyTitle, companyName, "Company name matches");
		
		//Navigate to EE management page
		chp.navigateToEmployeeManagement(EELastName);
		
		//Verify selected EE's EE management page is displayed
		em = new EmployeeManagement(driver());
		String EEname = em.returnEEname();
		Assert.assertEquals(EEname, EEFirstName+" "+EELastName, "EE name matches");
		
		//Navigate to EE's profile tab
		em.navigateToEmployeeTabs("Profile");
		
		//Navigate to EE's withholding page
		em.navigateToProfileLeftNav("Withholdings");
		
		//Print values in EE's withholdings information section
		ew = new EmployeeWithholdings(driver());

		ew.federalWithholdings("Filing Status");
		
		ew.federalWithholdings("Only 2 Jobs Total");
		
		ew.federalWithholdings("Total Dependent Credits:");
		
		ew.federalWithholdings("Other Income:");
		
		ew.federalWithholdings("Deductions:");
		
		ew.federalWithholdings("Extra Withholding Per Pay Period:");
		
		ew.stateWithholdings("Additional Amount Withheld (per pay period)");
		
		ew.stateWithholdings("Claimed Allowances");
		
		ew.stateSpecificFields("Live in KY, DC or Domiciled in MD, PA, WV");
		
		ew.stateSpecificFields("MSRRA");
		
		
	}
	
	
	
	

}
