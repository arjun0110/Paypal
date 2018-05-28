package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	
	public MyHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeads;
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement delLeads;
	

	
	
	@And("click Leads")
public MyLeadsPage clickLead()
		{
			
click(eleLeads);
	
return new MyLeadsPage();
		}


	public DeleteLead deleteLead()
	{
		click(delLeads);
		return new DeleteLead();
	}
	


		
	}
	
	
	
	


