package com.zoho.product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	 private List<Product> products;

	    public ShoppingCart() {
	        products = new ArrayList<>();
	    }

	    public void addProduct(Product product) {
	        products.add(product);
	    }

	    public int getTotal() {
	        int total = 0;
	        for (Product product : products) {
	            total += product.getPrice();
	        }
	        return total;
	    }

	    public void displayAll() {
	        for (Product product : products) {
	            System.out.println(product.getDescription());
	        }
	    }
}
