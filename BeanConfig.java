package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;



@Configuration
public class BeanConfig {
   @Bean(name = "helloBean") 
   //@Scope("prototype")
   public HelloWorld getHelloWorld(){
      return new HelloWorld();
   }
 

   
  // @Bean (name="emp")
   @Bean
   public Employee getEmployee(){
      return new Employee();
   }
   
   @Bean 
   public Department getDepartment(){
	   Department dept=new Department("IT","ABC");
	   //dept.setDepartmentName("IT");
	  // dept.setManager("ABC");
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
