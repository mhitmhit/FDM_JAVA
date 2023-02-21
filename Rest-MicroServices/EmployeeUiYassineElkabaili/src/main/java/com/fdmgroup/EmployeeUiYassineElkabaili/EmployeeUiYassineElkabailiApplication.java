package com.fdmgroup.EmployeeUiYassineElkabaili;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class EmployeeUiYassineElkabailiApplication {

	private final String CONTACT_API_ROOT = "http://localhost:8080";
	
	public static void main(String[] args) {
		
		SpringApplication.run(EmployeeUiYassineElkabailiApplication.class, args);
		
		
	}
	
	@Bean
	public WebClient.Builder builder(){
		return WebClient.builder();
	}
	
   @Bean
    public WebClient webClient(WebClient.Builder builder) {
        return builder
        		.baseUrl(CONTACT_API_ROOT)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

}
