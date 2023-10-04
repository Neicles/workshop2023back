package com.example.workplace2023Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Workplace2023BackendApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(Workplace2023BackendApplication.class, args
		);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Workplace2023BackendApplication.class);
	}

}
