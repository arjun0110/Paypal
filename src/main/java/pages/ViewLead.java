package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods {

	public ViewLead() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[@id='viewLead_firstName_sp']")
	private WebElement eleverifyFName;
	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement delete;
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement findlead;
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement duplicateLead;
	
	@FindBy(how=How.XPATH,using="//span[@id='viewLead_firstName_sp']")
	private WebElement nameMatch;
	
	
	String de,fn;
	
	public SelectaLead verifyFirstName(String displayedName)
	{
		verifyPartialText(eleverifyFName, displayedName);
		return new SelectaLead();
		
	}
	
	@And("Verify the leadID as (.*)")
	public ViewLead verifyLeadID(String leadID)
	{
		verifyPartialText(eleverifyFName, leadID);
		return this;
		
	}
	

	@And("click Delete the leads")
	public MyLeadsPage deleteaLead()
	{
		
		click(delete);
		return new MyLeadsPage();
		
	}
	
	public FindLead findLead()
	{
		click(findlead);
		return new FindLead();
	}
	
	
	
	public DuplicateLead clickDuplicate()
	{
		click(duplicateLead);
		return new DuplicateLead();
	}
	
	
	
	@And("verify FirstName")
	public ViewLead verifynameMatch()
	{
		DeleteLead dl = new DeleteLead();
		 de = dl.firstName;
		
		 fn = getText(nameMatch);
		if(fn.equalsIgnoreCase(de))
		{
			System.out.println("first name matches");
		}
		return this;
	}

}
