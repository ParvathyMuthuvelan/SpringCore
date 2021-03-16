package com.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.PersonDao;
import com.dao.PersonDaoImpl;
import com.model.Person;
import com.springjdbc.SpringJdbcConfig;

public class JdbcMain {

	public static void main(String[] args) {
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
		     //   SpringJdbcConfig.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		PersonDao personDao=(PersonDao)context.getBean("personDao");
		//PersonDao personDao = (PersonDaoImpl) context.getBean(PersonDao.class);
//		System.out.println("------Records Creation--------");
//		personDao.create("Hari", 31);
//		personDao.create("Nuha", 22);
//		personDao.create("Ayan", 25);
		System.out.println("------Listing Multiple Records--------");
		List<Person> list=personDao.listPersons();
		for (Person record : list) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.println(", Age : " + record.getAge());
		}
		System.out.println("----Updating Record with ID = 2 -----");
		personDao.update(2, 26);
		System.out.println("----Listing Record with ID = 2 -----");
	Person person = personDao.getPerson(2);
		System.out.print("ID : " + person.getId());
		System.out.print(", Name : " + person.getName());
		System.out.println(", Age : " + person.getAge());
	}
}
