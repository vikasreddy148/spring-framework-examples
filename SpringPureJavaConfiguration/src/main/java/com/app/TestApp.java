package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.app.bean.Token;
import com.app.config.AppConfig;

public class TestApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
		
		String msg = container.getBeanDefinition("obj2").getResourceDescription();
		System.out.println(msg);
		
		//ask container to get the bean
		Token t1 = container.getBean("obj1",Token.class);

		Token t2 = container.getBean("obj2",Token.class);
		
		
		//use the bean
		System.out.println(t1);
		System.out.println(t2);
		//close the container
		Thread.sleep(3000);
		 ((AbstractApplicationContext) container).close();
		

	}

}
