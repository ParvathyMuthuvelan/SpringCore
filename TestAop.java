package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop
{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
  
        ApplicationContext context = new ClassPathXmlApplicationContext
                            ("Beans.xml");
 
//        EmployeeService service = context.getBean(EmployeeService.class);
//  
//        service.getEmployeeById(1);
        
        EmployeeManager manager = ( EmployeeManager ) context.getBean("employeeManager");
        
        System.out.println(manager.getEmployeeById(1));
         
		manager.createEmployee(new Employee());
		manager.updateEmployee(new Employee());
		manager.deleteEmployee(100);
    }
    }

