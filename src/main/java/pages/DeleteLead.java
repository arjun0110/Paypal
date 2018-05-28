package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class DeleteLead extends ProjectMethods{
	
	


	public DeleteLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Phone")
	private WebElement clickPhone;
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement enterNumb;

	
	@FindBy(how=How.XPATH,using="//label[contains(text(),'Lead ID:')]/following::input")
	private WebElement selectLead;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement searchResut;
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	public static WebElement lead;
	
	

	@FindBy(how=How.XPATH, using="(//a[@class='linktext'])[4]")
	private WebElement eleCaptureLead;
	String leadID;

	
	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement del;

	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")
	private WebElement Name;
	String firstName;
	
	
	@And("click phone number option in find lead")
	public DeleteLead clickPhone()  {
		
		click(clickPhone);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		return this;
	}
	
	@And("Enter the phone number as (.*)")
	public DeleteLead enterNumber(String number) 
	{
		type(enterNumb,number);
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		return this;
	}
	
	@And("Find the lead associated with the phone number")
	public DeleteLead findNumber() {
		
		click(searchResut);
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		return this;
	}
	
	
	
	
	public String getText(){
		leadID=getText(eleCaptureLead);
		return leadID;
	}
	
	public String firstName() {
		
		 firstName = getText(Name);
		return firstName;
		
	}
	
	@And("Select the lead")
	public ViewLead selectLeads()
	{
		click(eleCaptureLead);
		return new ViewLead();
	}
	
	@And("Delete lead")
	public MyLeadsPage delete()
	{
		click(del);
		return new MyLeadsPage();
	}

	
	
}
