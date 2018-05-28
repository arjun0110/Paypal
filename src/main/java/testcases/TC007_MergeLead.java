package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MergeLead;
import pages.Newwindow1;
import pages.Newwindow2;
import wdMethods.ProjectMethods;

public class TC007_MergeLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC007_MergeLead";
		testDescription="Merge Lead";
		testNodes="Leads";
		category="Smoke";
		authors="arjun,hari";
		browserName="chrome";
		dataSheetName="TC007";
	}	
	
	@Test(dataProvider="fetchData")
public void mergeLead (String uname, String pwd,String id,String id2)
{
		
	
		Newwindow1 page=new LoginPage()
		.enterUserName(uname)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickMerge()
		.clickLookup()
		.enterleadid(id)
		.clickFind();
		String idd = page.gettextoffirstlead();
		page.selectfirstlead()
		
		

		.switchtofirstwindow()
		
		.secondloopupclick()
		.enterleadid2(id2)	
		.clickFind2()
		.selectsecondlead()
		.switchtofirstwindow()
		.clickmerge()
		.acceptAlerts()
		.findLead()
		.findID(idd)
		.Delete()
		.verifytheMatch();
				
}
	
	

}
