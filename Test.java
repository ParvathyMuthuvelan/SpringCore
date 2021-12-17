package com.beans;

import java.io.FileNotFoundException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


		public static void main(String[] args) throws BeansException, FileNotFoundException {
			ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
			HelloWorld obj1 = (HelloWorld) context.getBean("hello");
obj1.display();
	

	}

}
