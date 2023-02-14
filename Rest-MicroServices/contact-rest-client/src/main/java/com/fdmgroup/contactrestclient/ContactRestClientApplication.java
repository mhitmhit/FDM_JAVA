package com.fdmgroup.contactrestclient;

import java.net.http.HttpHeaders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;


@SpringBootApplication
public class ContactRestClientApplication {
	
	private final String CONTACT_API_ROOT = "http://localhost:8080";

	public static void main(String[] args) {
		SpringApplication.run(ContactRestClientApplication.class, args);
	}
	
	@Bean
	public WebClient.Builder builder(){
		return WebClient.builder();
	}
	
	@Bean
	public WebClient webClient(WebClient.Builder builder ) {
		return builder.baseUrl("http://localhost:8080")
				.defaultHeader(HttpHeaders,
						MediaType.APPLICATION_JSON)
				.build();
	}

}
