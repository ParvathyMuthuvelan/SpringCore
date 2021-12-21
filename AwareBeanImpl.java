package com.lifecycle;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareBeanImpl implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory method of AwareBeanImpl is called");
		System.out.println("setBeanFactory:: AwareBeanImpl singleton= " + beanFactory.isSingleton("awareBean"));
	}

	
	public void setBeanName(String beanName) {
		System.out.println("setBeanName method of AwareBeanImpl is called");
		System.out.println("setBeanName:: Bean Name defined in context= " + beanName);
	}

	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext method of AwareBeanImpl is called");
		System.out.println("setApplicationContext:: Bean Definition Names= "
				+ Arrays.toString(applicationContext.getBeanDefinitionNames()));
	}
	@PostConstruct
	public void customInit()
	{
		System.out.println("custom Init method called");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy method called");
	}
}
