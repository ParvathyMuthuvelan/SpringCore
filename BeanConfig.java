package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;



@Configuration
public class BeanConfig {
   @Bean(name = "helloBean") 
   //@Scope("prototype")
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
   @Bean 
   public Person getPerson(){
      return new Person();
   }
   @Bean (name="emp")
   public Employee getEmployee(){
      return new Employee();
   }
   
   @Bean 
   public Department getDepartment(){
	   Department dept=new Department();
	   dept.setDepartmentName("IT");
	   dept.setManager("ABC");
      return dept;
   }
   @Bean
   public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
       PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
       propertySourcesPlaceholderConfigurer.setLocations(new ClassPathResource("db.properties"));
       return propertySourcesPlaceholderConfigurer;
   }
}
