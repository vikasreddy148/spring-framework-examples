package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.app.bean.DbConfig;
import com.app.config.AppConfig;

public class TestApp {

	public static void main(String[] args) throws Exception {
		// 1. start the container
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
		String[] names = container.getBeanDefinitionNames();
		for (String bean : names) {
			System.out.println(bean);
		}
		
		String msg = container.getBeanDefinition("obj").getResourceDescription();
		System.out.println(msg);
		
		
		
		// 2. ask the container to get the bean
		DbConfig config = container.getBean(DbConfig.class);

		// 3. use bean
		System.out.println(config);

		// 4. close the container
		((AbstractApplicationContext) container).close();
	}

}