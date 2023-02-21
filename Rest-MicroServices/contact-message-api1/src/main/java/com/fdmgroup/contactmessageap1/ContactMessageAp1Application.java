package com.fdmgroup.contactmessageap1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ContactMessageAp1Application {

	public static void main(String[] args) {
		SpringApplication.run(ContactMessageAp1Application.class, args);
	}

}
