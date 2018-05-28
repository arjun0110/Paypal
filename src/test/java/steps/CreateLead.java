/*package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead {
	public static RemoteWebDriver driver;
	
	@Given("open the browser")
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@And("maximize the browser")
	public void maxbrowser() {
		
		driver.manage().window().maximize();
	}
	
	@And("enter the URL")
	public void enterURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@And("enter the username as (.*)")
	public void enterUsername(String data) {
		
		 driver.findElementById("username").sendKeys(data);
	}
	
	@And("enter the password")
	public void enterPassword() {
		
		driver.findElementById("password").sendKeys("crmsfa");
	}
	
	@And("click login button")
	public void login()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		
	}
	
	@And("click CRM/SFA")
	public void clickcrm() {
	driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("click the create lead link")
	
	public void clickCreateLead() {
		
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("enter the firstName (.*)")
	public void enterfirstName(String data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
		
	}

	@And("enter the lastName (.*)")
	public void enterLastname(String data) {
		
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
	}
	
	@And("enter the businessName (.*)")
	public void enterBusinessname(String data) {
		
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	}
	
	@When("clicking the create lead button")
	public void clickcreateLeadbutton()
	{
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		
	}
	
	@Then("verify the created lead")
	public void verifycreated()
	{
		System.out.println("lead is created");
	}
}*/