package managers;

import org.openqa.selenium.WebDriver;

import pageobjects.HomePage;
import pageobjects.LoginPage;

public class PageObjectManager {

	private WebDriver webDriver = null;
	private LoginPage loginPage = null;
	private HomePage homePage = null;
	
	public PageObjectManager(WebDriver driver) {
		this.webDriver = driver;
	}

	public LoginPage getLoginPage(){
		return (loginPage == null) ? loginPage = new LoginPage(webDriver) : loginPage;
	}
	
	public HomePage getHomePage(){
		return (homePage == null) ? homePage = new HomePage(webDriver) : homePage;
	}

}
