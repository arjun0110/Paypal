package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class EditPage extends ProjectMethods {
	
	
	public EditPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement firName;
	
	@FindBy(how=How.XPATH,using="//input[@name='submitButton']")
	private WebElement click;
	
			
	@And("change the firstname name as (.*)")
	public EditPage editfirName(String company)
	{
		
		type(firName, company);
		return this;
	}
	
	
	@And("click update")
	public ViewLead clickUpdate()
	{
		click(click);
		return new ViewLead();
	}
	
	@And("confirm the changed company name appears")
	public EditPage confirmeditlead() {
		System.out.println("Lead edited");
		return this;
	}
	

}
