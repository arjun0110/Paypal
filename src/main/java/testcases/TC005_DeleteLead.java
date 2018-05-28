package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.DeleteLead;
import pages.FindLead;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Delete a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="arjun,hari";
		browserName="chrome";
		dataSheetName="TC005";
	}	
	
	@Test(dataProvider="fetchData")
public void deleteaLead (String uname, String pwd, String num, String name,String firstResLead )
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
		
		//String firstResLead=page.getText();
		
		.selectLeads()
		.verifyLeadID(name)
		.deleteaLead()
		.findLead()
		.typeCapturedLead(firstResLead)
		.Delete()
		.verifytheMatch();
		
		
		
}
}
