package com.annotation;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertyMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		PopulateBean bean = context.getBean(PopulateBean.class);
		System.out.println("Array " + Arrays.toString(bean.getValuesArray()));

		System.out.println("List values="+bean.getValuesList());
		System.out.println("Map=" + bean.getValuesMap());
		System.out.println("Filtered map=" + bean.getValuesMapFiltered());
		Shop shop = context.getBean(Shop.class);
		System.out.println("Shop Location " + shop.getShopLocation());
		System.out.println(shop.getDiscountDetails());

	}

}
