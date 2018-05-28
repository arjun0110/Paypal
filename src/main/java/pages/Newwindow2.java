package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Newwindow2 extends ProjectMethods{
	
	public Newwindow2() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement leadidfield2;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Find Leads')]")
	private WebElement findlead2;
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement selectaleadtomerge2;
	
	
	
	
	
public Newwindow2 enterleadid2(String id) {
		
		type(leadidfield2, id);
		return this;
		
	}
	
	
	public Newwindow2 clickFind2() {
		
		click(findlead2);
		return this;
	}
	
	public Newwindow2 gettextoffirstlead() {
		
		getText(selectaleadtomerge2);
		return this;
	}
	
	public Newwindow2 selectsecondlead() {
		
		clickWithNoSnap(selectaleadtomerge2);;
		
		return this;
	}
	
	public MergeLead switchtofirstwindow() {
		
		switchToWindow(0);
		return new MergeLead();
	}
	
	

}
