package org.clas;

import org.openqa.selenium.WebElement;

import com.test.LibGlobal;

public class TestSample extends LibGlobal {

	public static void main(String[] args) {
		getDriver();
		urlLaunch("http://www.adactinhotelapp.com/");
		LoginPage LoginPage = new LoginPage();
		enterText(LoginPage.getTxtUserName(),"karthi007");
    	enterText(LoginPage.getTxtPassword(),"Karthi@1989");
    	btnClick(LoginPage.getBtnLogin());
//		WebElement txtUserName = LoginPage.getTxtUserName();
//		
//		enterText(txtUserName, "karthi007");
//	WebElement txtPassword = LoginPage.getTxtPassword();
//	enterText(txtPassword, "Karthi@1989");
//		WebElement btnLogin = LoginPage.getBtnLogin();
//	btnLogin.click();
	}

}
