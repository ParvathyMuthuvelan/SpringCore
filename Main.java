package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.beans.ApplicationConfig;
import com.beans.Employ;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Employ emp=(Employ)context.getBean("emp");
		System.out.println("Employee Details"+emp);
		
	}

}
