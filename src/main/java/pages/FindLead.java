package pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class FindLead extends ProjectMethods {

	public FindLead ()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleLeadTab;
	
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement verify;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement findlead;
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement idfield;
	

	@And("Enter the deleted LeadID as (.*)")
	public FindLead typeCapturedLead(String firstResLead){
		type(eleLeadTab, firstResLead);
		return this;
	}
	
	
	public FindLead findID(String idd)
	{
	
		type(idfield,idd);
		return this;
	}
	
	@When("Click the findlead button")
	public FindLead Delete() {
		
		click(findlead);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		return new FindLead();
	}
	
	@Then("Verify the text")
	public FindLead verifytheMatch() {
		
		verifyExactText(verify, "No records to display");
		return this;
	}


}
