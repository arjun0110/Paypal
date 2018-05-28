package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how = How.ID, using = "username")

	private WebElement eleUserName;
	
	
	@And("enter the username as (.*)")
	
	public LoginPage enterUserName(String data) {
		type(eleUserName, data);
		return this;
	}

	@FindBy(how = How.ID, using = "password")
	private WebElement elePassword;

	@And("enter the password as (.*)")
	public LoginPage enterPassword(String data) {
		type(elePassword, data);
		return this;
	}

	
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	private WebElement eleLogin;
	@And("click login button")
	
	public HomePage clickLogIn() {
		click(eleLogin);
		return new HomePage();
	}
	
	

}
