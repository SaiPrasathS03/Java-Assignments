package com.zoho.product;

public class MainCart {
	public static void main(String[] args) {
		ElectronicsProduct laptop = new ElectronicsProduct("Smartphone", 699);
        ClothingProduct pant = new ClothingProduct("T-shirt", 199, 36);
        BookProduct book = new BookProduct("Java Programming", 29, "James Gosling");

        ShoppingCart c = new ShoppingCart();
        c.addProduct(laptop);
        c.addProduct(pant);
        c.addProduct(book);

        c.displayAll();
        System.out.println("Total Price: " + c.getTotal());
	}
}
