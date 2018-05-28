package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SignUp extends ProjectMethods {
	
	
	public SignUp() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Sign Up for Free")
	private WebElement signup;
	
	public SignUpConfirm clickSignup() {
		
		click(signup);
		return new SignUpConfirm();
		
	}

}
