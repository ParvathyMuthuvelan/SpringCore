package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;



@Configuration
public class BeanConfig {
	@Autowired
	private Department dept;
	
   @Bean(name = "helloBean") 
   //@Scope("prototype")
   public HelloWorld getHelloWorld(){
      return new HelloWorld();
   }
 

   
  // @Bean (name="emp")
   @Bean
   public Employee getEmployee(){
//	   Employee emp=new Employee();
//	   emp.setId(1001);
//	   emp.setName("A");
//	   emp.setDepartment(dept);
//	   return emp;
     return new Employee(1001,"A",dept);
   }
   
   @Bean 
   public Department getDepartment(){
	  dept=new Department("IT","ABC");
//	   dept=new Department();
//	   dept.setDepartmentName("IT");
//	   dept.setManager("ABC");
      return dept;
   }
   
   @Bean
   public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
       PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
       propertySourcesPlaceholderConfigurer.setLocations(new ClassPathResource("data.properties"));
       return propertySourcesPlaceholderConfigurer;
   }
  
     
   @Bean 
   public Shop getShop(){
	   Shop shop=new Shop();
	  
      return shop;
   }
   @Bean
   public PopulateBean getPropBean()
   {
	   PopulateBean bean=new PopulateBean();
	   return bean;
   }
}
