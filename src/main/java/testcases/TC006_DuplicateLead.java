package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLead";
		testDescription="Duplicate Lead";
		testNodes="Leads";
		category="Smoke";
		authors="arjun,hari";
		browserName="chrome";
		dataSheetName="TC006";
	}	
	
	@Test(dataProvider="fetchData")
public void DuplicateLead (String uname, String pwd, String num, String name)
{
		new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.Find()
		.clickPhone()
		.enterNumber(num)
		.findNumber()	
		.selectLeads()
		.clickDuplicate()
		.verifyTitleMatch()
		.createDuplicate()
		.verifynameMatch();
		
		
		
		
}
}
