package com.zoho.product;

public class BookProduct extends Product{
	String author;
	public BookProduct(String productName, int price,String author) {
		super(productName, price);
		this.author = author;
	}
	@Override
	public int getPrice() {
		return price;
	}
	@Override
	public String getDescription() {
		return "BookProduct: "+productName+" Price:"+price+" Author: "+author;
	}

	
	
}
