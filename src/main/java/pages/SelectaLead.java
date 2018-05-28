package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class SelectaLead extends ProjectMethods{

	public SelectaLead()
	{
		PageFactory.initElements(driver, this);
		
		
	}

	@FindBy(how = How.LINK_TEXT,using="Edit")
	private WebElement edit;
	
@And("click edit")	
public EditPage clickEdit()
{
	click(edit);
	return new EditPage();
}
	
}
