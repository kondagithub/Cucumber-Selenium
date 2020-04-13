package managers;

import pageobjects.HomePage;
import pageobjects.LoginPage;

public class Test {
	public static void main(String[] args) {
		PageObjectManager pageObjectManager = null;
		LoginPage loginPage = null;
		HomePage homePage = null;
		try {
//			System.out.println("Test1");
//			pageObjectManager = new PageObjectManager("firefox");
//			System.out.println("Test2");
//			loginPage = pageObjectManager.getLoginPage();
//			homePage = pageObjectManager.getHomePage();
//			System.out.println("Test3");
//			loginPage.navigateToLoginPage();
//			System.out.println("Test4");
//			loginPage.performLogin("kondareddy.a@gmail.com", "Password@7");
//			System.out.println("Test5");
//			Thread.sleep(5000);
//			homePage.performLogout();
//			System.out.println("Test6");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(null != homePage) {
				homePage.getWebDriver().quit();
				System. exit(0);
			}
		}
	}
}
