package com.fdmgroup.contactmessageapi2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ContactMessageApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(ContactMessageApi2Application.class, args);
	}

}
