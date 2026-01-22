package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.bean.Token;

@Configuration
public class AppConfig {
	
	@Bean
	public Token obj1() {
		Token token = new Token();
		token.setId(10);
		
		return token;
	}
	
	@Bean
	public Token obj2() {
		Token token = new Token();
		token.setId(20);
		
		return token;
	}

}
