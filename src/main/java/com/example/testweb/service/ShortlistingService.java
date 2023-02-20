package com.example.testweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShortlistingService {
	
	@Autowired
	private LoginService loginService;
	
	
	public void process() {
		loginService.performLogin();
	}

}
