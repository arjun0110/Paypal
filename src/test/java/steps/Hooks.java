package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods {
	@Before
	public void before(Scenario sc) {


		startResult();
		startTestModule(sc.getName(), sc.getId());
		
		test = startTestCase(sc.getId());
		//test.assignCategory("smoke");
		test.assignAuthor("Arjun");
		startApp("chrome");

	}

	@After
	public void after(Scenario sc) {
		closeAllBrowsers();
		endResult();

	}
}
