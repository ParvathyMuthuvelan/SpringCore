package com.spring.aop;

import org.aspectj.lang.JoinPoint;

public class EmployeeCRUDLoggingAspect
{
    public void logBefore(JoinPoint joinPoint) 
    {
        System.out.println("EmployeeCRUDAspect.logBefore() using xml : " + joinPoint.getSignature().getName());
    }
     
    public void logAfter(JoinPoint joinPoint) 
    {
        System.out.println("EmployeeCRUDAspect.logAfter() using xml : " + joinPoint.getSignature().getName());
    }
}
