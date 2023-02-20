package com.example.testweb.pagemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.annotation.PostConstruct;

public class BasePage {
	
	@Autowired
	protected WebDriver driver;
	
	@PostConstruct
	private void initDriver() {
		PageFactory.initElements(driver, this);
	}
	
	public void navigate(String url) {
		driver.manage().window().fullscreen();
		this.driver.navigate().to(url);	
	}

}
