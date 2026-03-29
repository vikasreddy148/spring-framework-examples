package com.app.bean;

import org.springframework.stereotype.Component;

@Component
public class Service {
	
	public Service(){
		System.out.println("Object created using @Component");
	}
	
	public void doWork() {
		System.out.println("Service is doing some work");
	}

}