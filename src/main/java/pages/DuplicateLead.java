package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods {
	
	public DuplicateLead()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//div[@id='sectionHeaderTitle_leads']")
	private WebElement verifyTitle;
	
	@FindBy(how=How.XPATH,using="//input[@name='submitButton']")
	private WebElement submit;
	
	
	public DuplicateLead verifyTitleMatch() {
		verifyDisplayed(verifyTitle);
		return this;

	}

	public ViewLead createDuplicate()
	{
		click(submit);
		return new ViewLead();
	}
}
