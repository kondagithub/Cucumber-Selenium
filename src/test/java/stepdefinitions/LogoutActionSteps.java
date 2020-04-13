package stepdefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class LogoutActionSteps {

	TestContext testContext;
	LoginPage loginPage;
	HomePage homePage;
	
	public LogoutActionSteps(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage();
		homePage = testContext.getPageObjectManager().getHomePage();
	}

	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		loginPage.navigateToLoginPage();
		loginPage.accepteCookies();
		loginPage.performLogin("ABC@gmail.com", "Password@7");
	}

	@When("^User performed logout$")
	public void user_performed_logout() throws Throwable {
		homePage.performLogout();
		Thread.sleep(5000);
	}

	@Then("^User logout is successful$")
	public void user_logout_is_successful() throws Throwable {
		homePage.getWebDriver().quit();
	}
	
}
