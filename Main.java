package com.beans;

import java.io.FileNotFoundException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.PatientService;

public class Main {
	public static void main(String[] args) throws BeansException, FileNotFoundException {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("hello");
		obj.display();
//Setter Injection
		User u=(User)context.getBean("user");
		System.out.println("User details");
		System.out.println(u);
		
		User u1=(User)context.getBean("user1");
		System.out.println("User details");
		System.out.println(u1);
		// Inner bean setter injection
		
//		Person p=(Person)context.getBean("person");
//		System.out.println(p);
		
		//Inner bean cons. injection
		Person p1=(Person)context.getBean("person1");
		System.out.println(p1);
		
		Employee emp=(Employee)context.getBean("employeeBean");
		System.out.println(emp);
		
//		PatientService ps=context.getBean("ps",PatientService.class);
//		ps.getPatientDetails();
		
		//Injecting collections
		//ShapeCollection shape = (ShapeCollection) context.getBean("shapeCollection");
		//System.out.println(shape);
		//shape.getMap();
		// java -jar SpringProject-0.0.1-SNAPSHOT-jar-with-dependencies.jar

	}
}
