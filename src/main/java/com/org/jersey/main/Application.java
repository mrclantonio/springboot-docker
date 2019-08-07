package com.org.jersey.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.org.jersey.config", "com.org.jersey.rest" })

public class Application { 

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
