package stepdefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.LoginPage;

public class LoginActionSteps{

	TestContext testContext;
	LoginPage loginPage;
	
	public LoginActionSteps(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage();
	}
	
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		loginPage.navigateToLoginPage();
	}

	@When("^User accepted cookies$")
	public void user_accepted_cookies() throws Throwable {
		loginPage.accepteCookies();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and performed login action$")
	public void user_enters_and_and_performed_login_action(String userName, String password) throws Throwable {
		loginPage.performLogin(userName, password);
	}

	@Then("^User login is successful$")
	public void user_login_is_successful() throws Throwable {
		loginPage.getWebDriver().quit();
	}
}
