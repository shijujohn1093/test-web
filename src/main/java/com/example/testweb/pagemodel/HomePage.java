package com.example.testweb.pagemodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class HomePage extends BasePage {


	
//	@FindBy(how = How.LINK_TEXT, using = "login")
//	public WebElement linkLogin;
//	
//	@FindBy(how = How.LINK_TEXT, using = "password")
//	public WebElement txtPassword;
	
	@FindBy(how = How.CSS, using = ".home_page_login_button")
	public WebElement btnLogin;
	
	@FindBy(how = How.CSS, using = ".dropdown-toggle")
	public WebElement dropDownButton;
	
	@FindBy(how = How.LINK_TEXT, using = "As a student")
	public WebElement clickAsStudent;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"login-link-container\"]/span")
	public WebElement loginToggle;
	
	//*[@id="login-link-container"]/span
	
	
	public void clickLogin() {
		dropDownButton.click();
		clickAsStudent.click();
		loginToggle.click();
//		btnLogin.click();
		log.info("Click login");
	}
	
	
	

}
