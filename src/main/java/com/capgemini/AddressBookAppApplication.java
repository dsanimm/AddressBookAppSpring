package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressBookAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AddressBookAppApplication.class, args);
		log.info("Address Book App Started in {} Environment", context.getEnvironment().getProperty("environment"));
		log.info("Address Book App Database User is {}",
				context.getEnvironment().getProperty("spring.datasource.username"));
	}

}