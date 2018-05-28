package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create a new Lead";
		testNodes="Leads";
		category="Smoke";
		authors="arjun,hari";
		browserName="chrome";
		dataSheetName="TC003";
	}	
	
	@Test(dataProvider="fetchData")
	public void createLead(String uName, String password, String companyName, String firstName, String lastName, String displayedName)
	{
	
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(password)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickLeads()
		.inputCompanyName(companyName)
		.inputFirstName(firstName)
		.inputLastName(lastName)
		.clickCreatebutton()
		.verifyFirstName(displayedName);

	}
	
	
	
}
