package com.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Student;

public class TestApp {

	public static void main(String[] args) throws Exception {
		
		System.out.println("**************Cotainer Started*******************");
		// 1. start the container[EAGER LOADING]
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. ask the container to get the bean
		Student s1 = container.getBean("s1",Student.class);
		
		Student s2 = container.getBean("s1",Student.class);
		Student s3 = container.getBean("s2",Student.class);
		
		

		// 3. use bean
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.hashCode() + "  " + s3.hashCode());
		
		System.out.println(s1.equals(s2));

		// 4. close the container
		((AbstractApplicationContext) container).close();
		System.out.println("**************Cotainer Stopped*******************");
		
	}

}

