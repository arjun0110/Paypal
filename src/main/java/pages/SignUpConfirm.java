package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SignUpConfirm extends ProjectMethods {
	
	public SignUpConfirm() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.ID,using="radio-personal")
	 private  WebElement ele;
	
	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement nextbutton;
	
	public SignUpConfirm verifySelected1()	
	{
	
		verifySelected(ele);
		return this;
	}
	
	
	public Account clickNext()
	{
		click(nextbutton);
		return new Account();
	}
	
	

}
