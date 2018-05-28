package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	
	public HomePage() {		
		PageFactory.initElements(driver,this);
	}	

	
	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement eleCRM;
	

	
	@And("click CRM/SFA")
	public MyHomePage clickCRMSFA()
	{
		
		click(eleCRM);
		return new MyHomePage();
		
	}

	public Object verifyLoggedName(String vName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
