package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Account extends ProjectMethods{
	
	public Account() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy (how=How.ID,using="email")
private WebElement email;


@FindBy (how=How.ID,using="password")
private WebElement password;


@FindBy (how=How.ID,using="confirmPassword")
private WebElement confirmPassword;

@FindBy(how=How.XPATH,using="//input[@name='_eventId_continue']")
private WebElement Continue;


public Account enteremail(String data)
{
	type(email, data);
	return this;
}

public Account enterPassword(String data) {
	
	type(password, data);
	return this;
	
}

public Account enterConfirmPassword(String data) {
	
	type(confirmPassword, data);
	return this;
}

public AccountCreated clickContinue() {
	click(Continue);
	return new AccountCreated();
}

}
