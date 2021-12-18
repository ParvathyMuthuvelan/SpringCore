package com.beans;

import java.io.FileNotFoundException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws BeansException, FileNotFoundException {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("Bean scope");
		HelloWorld obj1 = (HelloWorld) context.getBean("hello");
		System.out.println(obj1.getMessage());
		System.out.println("Hashcode of obj1="+obj1.hashCode());
		HelloWorld obj2 = (HelloWorld) context.getBean("hello");
		System.out.println("Hashcode of obj2="+obj2.hashCode());
	
		HelloWorld obj3 = (HelloWorld) context.getBean("hello");
		System.out.println("Hashcode of obj3="+obj3.hashCode());

		
		
		
		//constructor injection (3-arg cons)
		System.out.println("Constructor injection");
		Player p=(Player)context.getBean("player");
		System.out.println("Player details");
		System.out.println(p);
		
		//constructor-injection(2-arg cons)
		Player p1=(Player)context.getBean("player1");
		System.out.println("Player details");
		System.out.println(p1);
		
		//constructor-injection(2-arg cons - index)
				Player p2=(Player)context.getBean("player2");
				System.out.println("Player details");
				System.out.println(p2);
				System.out.println("Inner bean - cons injection");
				Person person1=(Person)context.getBean("person1");
				System.out.println(person1);
				System.out.println("Inner bean - setter injection");
				Person person2=(Person)context.getBean("person2");
				System.out.println(person2);
				
				Employee emp=(Employee)context.getBean("emp");
				System.out.println(emp);
				
				
	}

}
