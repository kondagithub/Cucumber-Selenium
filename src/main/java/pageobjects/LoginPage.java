package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver webDriver;
	
	public LoginPage(WebDriver webDriver) {
		 PageFactory.initElements(webDriver, this);
		 this.webDriver = webDriver;
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/a")
	private WebElement btn_accept;
	
	@FindBy(how = How.ID, using = "loginid") 
	private WebElement txtbx_UserName;
	
	@FindBy(how = How.ID, using = "password") 
	private WebElement txtbx_Password;
	
	@FindBy(how = How.CSS, using = "button[class='button small ivsg2-height-override btn-primary ng-binding ng-isolate-scope'")
	private WebElement btn_logn;
	
//	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/header/section/div[2]/div[2]/form/div[3]/div[2]/button")
//	private WebElement btn_logn;
	
	public void enterUserName(String userName) {
		txtbx_UserName.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		txtbx_Password.sendKeys(password);
	}
	
	public void performLogin(String userName, String password) throws Exception{
		enterUserName(userName);
		enterPassword(password);
		Thread.sleep(5000);
		btn_logn.click();
	}
	
	public void navigateToLoginPage() {
		webDriver.get("http://www.ba.com");
	}
	
	public void accepteCookies() {
		btn_accept.click();
	}
	
	public WebDriver getWebDriver() {
		return webDriver;
	}
}
