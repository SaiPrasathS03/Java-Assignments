package com.zoho.document;

public class MainDocument {
	public static void main(String[] args) {
		Document pdf = new PdfDocument();
		Document text = new TextDocument();
		Document image = new ImageDocument();
		pdf.print();
		text.print();
		image.print();
	}
}
