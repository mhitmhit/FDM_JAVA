package com.fdmgroup.messageui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MessageUiApplication {

	private static final String Message_BASE_URL = "http://localhost:8091";
	
	public static void main(String[] args) {
		SpringApplication.run(MessageUiApplication.class, args);
	}
	
//	@Bean
//	public WebClient.Builder builder() {
//		return WebClient.builder();   
//	}     
//	
//	
//	@Bean    
//	public WebClient webClient(WebClient.Builder builder) {        
//		return builder.baseUrl(MESSAGE_BASE_URL)
//			.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
//			.build();    
//	}

}
