package com.example.testweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.testweb.pagemodel.HomePage;
import com.example.testweb.pagemodel.LoginPage;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LoginService {

	@Value("${app.user}")
	private String user;
	
	@Value("${app.password}")
	private String password;
	
	
	@Autowired
	private LoginPage loginPage;
	
	@Autowired
	private HomePage homePage;
	
	@Value("${app.url}")
	private String apppUrl;
	
	
	
	public void performLogin() {
		homePage.navigate(apppUrl);
		log.info("Login action to {} ", apppUrl);
		homePage.clickLogin();
		loginPage.login(user, password);
		loginPage.clickLogin();		
	}
}
