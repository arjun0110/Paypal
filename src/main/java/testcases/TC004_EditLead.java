package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;



public class TC004_EditLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="arjun,hari";
		browserName="chrome";
		dataSheetName="TC004";
	}	
	
	@Test(dataProvider="fetchData")
	public void editLead(String uname, String pwd,String cname, String fname, String lname,String vname,String companyy, String displayedName)
	{
		
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickLeads()
		.inputCompanyName(cname)
		.inputFirstName(fname)
		.inputLastName(lname)
		.clickCreatebutton()
		.verifyFirstName(vname)
		.clickEdit()
		.editfirName(companyy)
		.clickUpdate()
		.verifyFirstName(displayedName);
		
	}
	
}
