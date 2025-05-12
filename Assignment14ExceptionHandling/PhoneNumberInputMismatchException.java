package com.zoho;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumberInputMismatchException {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String phNo = sc.next();
			for(int i=0;i<phNo.length();i++) {
				if(phNo.charAt(i)<'0' || phNo.charAt(i)>'9') {
					throw new InputMismatchException();
				}
			}
			System.out.println("Phone number filled");	
	}

}
