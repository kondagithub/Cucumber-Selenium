package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver webDriver;
	
	public HomePage(WebDriver webDriver) {
		 PageFactory.initElements(webDriver, this);
		 this.webDriver = webDriver;
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Log out")
	private WebElement btn_logout;
	
	public void performLogout() {
		btn_logout.click();
	}
	
	public WebDriver getWebDriver() {
		return webDriver;
	}
}
