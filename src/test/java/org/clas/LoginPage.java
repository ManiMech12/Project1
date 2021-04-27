package org.clas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.LibGlobal;

public class LoginPage extends LibGlobal {


	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(id= "username"),@FindBy(xpath="//input[@id='username']")})
    private WebElement txtUserName;
	
	@FindAll({@FindBy(id= "password"),@FindBy(xpath="//input[@id='password']")})

	private WebElement txtPassword;
	
	
	@FindAll({@FindBy(id= "login"),@FindBy(xpath="//input[@id='login']")})
	
//	@FindBy(id= "username")
//	private WebElement txtUserName;
//	@FindBy(id= "password")
//	private WebElement txtPassword;
//	@FindBy(id= "login")
//	
	private WebElement btnLogin;
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
}
