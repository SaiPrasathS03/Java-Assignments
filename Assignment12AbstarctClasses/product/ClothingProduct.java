package com.zoho.product;

public class ClothingProduct extends Product{

	int size;

	public ClothingProduct(String productName, int price, int size) {
		super(productName, price);
		this.size = size;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return "ClothingProduct: "+productName+" Price:"+price+" size:"+size;	
	}
	
}
