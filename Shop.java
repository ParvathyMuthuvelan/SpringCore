package com.annotation;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

public class Shop {

	
	private String shopName;
	@Value("chennai")
	private String shopLocation;
	@Value("#{{'KEY1': 10, 'KEY2': 20, 'KEY3': 30}}")
	//@Value("#{db}")
	private Map<String,Integer> discountDetails;

	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopLocation() {
		return shopLocation;
	}
	public void setShopLocation(String shopLocation) {
		this.shopLocation = shopLocation;
	}
	public Map<String, Integer> getDiscountDetails() {
		return discountDetails;
	}
	//@Value("#{{'KEY1': 10, 'KEY2': 20, 'KEY3': 30}}")
	public void setDiscountDetails(Map<String, Integer> discountDetails) {
		this.discountDetails = discountDetails;
		
	}	
	
}














