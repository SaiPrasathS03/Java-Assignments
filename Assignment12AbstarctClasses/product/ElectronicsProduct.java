package com.zoho.product;

public class ElectronicsProduct extends Product{
	
	public ElectronicsProduct(String productName, int price) {
		super(productName,price);
	}
	@Override
	public int getPrice() {
		return price;
	}
	@Override
	public String getDescription() {
		return "ElectronicsProduct: "+productName+" Price:"+price;
	}
	
}
