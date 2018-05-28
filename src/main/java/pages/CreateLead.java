package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods {

	public CreateLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	private WebElement eleCName;
	
	@FindBy(how=How.ID,using ="createLeadForm_firstName")
	private WebElement eleFName;

	@FindBy(how=How.ID,using ="createLeadForm_lastName")
	private WebElement eleLName;
	
	@FindBy(how=How.XPATH,using="//input[@value='Create Lead']")
	private WebElement eleCreateButton;
	
	@And("enter the businessName as (.*)")
	public CreateLead inputCompanyName(String companyName) {
		type(eleCName, companyName);
		return this;

	}
	
	@And("enter the firstName as (.*)")
	public CreateLead inputFirstName(String firstName) {
		
		type(eleFName, firstName);
		return this;		

	}
	
	@And("enter the lastName as (.*)")
	public CreateLead inputLastName(String lastName) {
		
		type(eleLName, lastName);
		return this;		

	}
	
	@When("clicking the create lead button")
	public ViewLead clickCreatebutton() {
		
		click(eleCreateButton);
		return new ViewLead();
		
	}
	
	@Then("verify the created lead")
	public void confirm() {
		System.out.println("lead created");
	}
	
	
	
	
	

}
