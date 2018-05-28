package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods {
	
	public MergeLead() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[1]")
	private WebElement loopup;
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement secondlookup;
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement mergebutton;
	
	public Newwindow1 clickLookup() {
		
		click(loopup);
		switchToWindow(1);
		return new Newwindow1();
	}
	
	public Newwindow2 secondloopupclick() {
		
		clickWithNoSnap(secondlookup);
		switchToWindow(1);
		return new Newwindow2();
		
		
	}
	
	public MergeLead clickmerge() {
		clickWithNoSnap(mergebutton);
		return this;
	}
	
	public ViewLead acceptAlerts() {
		acceptAlert();
		return new ViewLead();
	
	}
	
	
	
	

}
