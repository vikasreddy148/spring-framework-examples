package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.app.bean.TokenService;
import com.app.config.AppConfig;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

		// 2. ask the container to get the bean
		TokenService t1 = container.getBean(TokenService.class);
		System.out.println(t1.hashCode() + "----> " + t1.getToken().hashCode());
		System.out.println(t1);
		System.out.println("********************************************");

		// 2nd time
		TokenService t2 = container.getBean(TokenService.class);
		System.out.println(t2.hashCode() + "----> " + t2.getToken().hashCode());
		System.out.println(t2);
		System.out.println("********************************************");

		// 3rd time
		TokenService t3 = container.getBean(TokenService.class);
		System.out.println(t3.hashCode() + "----> " + t3.getToken().hashCode());
		System.out.println(t3);

		// 3. use bean
		// close the container

		((AbstractApplicationContext) container).close();

	}

}
