package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Newwindow1 extends ProjectMethods {
	
	public String leadID;
	
	public Newwindow1() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement leadidfield;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement findlead;
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement selectaleadtomerge;
	

	
	public Newwindow1 enterleadid(String idd) {
		
		type(leadidfield, idd);
		return this;
		
	}
	
	
	public Newwindow1 clickFind() {
		
		click(findlead);
		return this;
	}
	
	public String gettextoffirstlead() {
		
		 //leadID = getText(selectaleadtomerge);
		 leadID = selectaleadtomerge.getText();
		return leadID;
	}
	
	public Newwindow1 selectfirstlead() {
		
		click(selectaleadtomerge);;
		
		
		return this;
	}
	
	public MergeLead switchtofirstwindow() {
		
		switchToWindow(0);
		return new MergeLead();
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
