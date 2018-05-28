package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleMyLeads;
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement findlead;
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement MergeLeadclick;
	
	public MergeLead clickMerge()
	{
		click(MergeLeadclick);
		return new MergeLead();
	}
	
	
@And("click the create lead link")	
public CreateLead clickLeads()
		{
			
click(eleMyLeads);
	
return new CreateLead() ;
		}

@And("click Find a Lead")
public DeleteLead Find() {
	
	click(findlead);
	return new DeleteLead();
}

@And("click FindLeads")
public FindLead findLead()
{
	click(findlead);
	return new FindLead();
}
		

		
	}
	
	
	
	


