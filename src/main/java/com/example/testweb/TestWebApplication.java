package com.example.testweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.testweb.service.ShortlistingService;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class TestWebApplication implements CommandLineRunner{
	
	@Autowired
	private ShortlistingService shortlistingService;

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "C:\\dev\\workspaces\\chromedriver_win32");

		SpringApplication.run(TestWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("This shortlisting started");
		shortlistingService.process();
		log.info("This shortlisting stopped");

		
	}

}
