package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SignUp;
import wdMethods.ProjectMethods;

public class Paypal extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="paypal";
		testDescription="paypal account";
		authors="arjun,hari";
		testNodes="Paypal";
		browserName="chrome";
		dataSheetName="Paypal";
	}	
	
	
	@Test(dataProvider="fetchData")
	public void paypalaccount(String email, String password, String confirm)
	{
		new SignUp()
		.clickSignup()
		.verifySelected1()
		.clickNext()
		.enteremail(email)
		.enterPassword(password)
		.enterConfirmPassword(confirm)
		.clickContinue();
		
	}

}
