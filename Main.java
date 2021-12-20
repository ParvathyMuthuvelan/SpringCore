package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//Java Based Configuration
public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new 
				AnnotationConfigApplicationContext(BeanConfig.class);
		HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloBean");
		helloWorld.setMessage("Hello World!");
		System.out.println(helloWorld.getMessage());
		Employee e=(Employee)ctx.getBean(Employee.class);
		System.out.println(e);

//		ApplicationContext context = new 
//				AnnotationConfigApplicationContext(BeanConfig.class, DBconfig.class); 
//	         DBconfig config = ctx.getBean(DBconfig.class);
//	       System.out.println(config);
//		Shop shop=context.getBean(Shop.class);
//		System.out.println(shop.getDiscountDetails());
		
	}
}
