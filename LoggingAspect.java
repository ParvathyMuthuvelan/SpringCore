package com.spring.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
 
//	@AfterReturning("execution(* com.spring.aop.EmployeeManagerImpl.*(..))")
//    public void logAfterReturningAllMethods() throws Throwable 
//    {
//        System.out.println("****LoggingAspect.logAfterReturningAllMethods() ");
//    }
 
//    @AfterReturning(pointcut="execution(* com.spring.aop.EmployeeManagerImpl.getEmployeeById(..))", returning="retVal") 
//    public void logAfterReturningGetEmployee(Object retVal) throws Throwable 
//    {
//        System.out.println("****LoggingAspect.logAfterReturningGetEmployee() ");
//        System.out.println(((Employee)retVal).getName());
//    }
}
