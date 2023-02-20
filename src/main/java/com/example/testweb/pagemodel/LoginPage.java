package com.example.testweb.pagemodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class LoginPage extends BasePage {


	
	@FindBy(how = How.NAME, using = "email")
	public WebElement txtUserName;
	
	@FindBy(how = How.NAME, using = "password")
	public WebElement txtPassword;
	
	@FindBy(how = How.ID, using = "modal_login_submit")
	public WebElement btnLogin;
	
	public void login(String userName, String password) {
		txtUserName.sendKeys(userName);
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	

}
