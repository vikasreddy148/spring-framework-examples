package com.app.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import com.app.bean.Student;

@Configuration
@ComponentScan("com.app")
public class AppConfig {
	
	

	@Bean
	public Student service() {
		System.out.println("***********Object created using @Bean ****************");
		Student service = new Student();
	
		return service;
	}

}