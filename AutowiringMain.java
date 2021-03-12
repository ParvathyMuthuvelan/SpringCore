package com.autowire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AutowiringMain {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Beans.xml");
//		Author author=(Author)context.getBean("author");
//	  System.out.println("Author Name :"+author.getName());
//	  System.out.println("Book details");
//	  System.out.println("Name :"+author.getBook().getBookName());
//	  System.out.println("Price :"+author.getBook().getBookPrice());
	  
		Author authorObj=(Author)context.getBean("author2");
		System.out.println("Author Name :"+authorObj.getName());
		System.out.println("Book details");
		System.out.println("Name :"+authorObj.getBk().getBookName());
		System.out.println("Price :"+authorObj.getBk().getBookPrice());
		//System.out.println("Edition :"+authorObj.getBk().getEdition());
	}
}
