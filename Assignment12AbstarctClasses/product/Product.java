package com.zoho.product;

public abstract class Product {
	String productName;
	int price;
	public Product(String productName,int price) {
		this.productName = productName;
		this.price = price;
	}
	    public abstract int getPrice();
	    public abstract String getDescription();
}
