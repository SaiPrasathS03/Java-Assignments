package com.zoho;

public class MathOperations {

	public static int addInt(int a,int b) {
		return a+b;
	}
	public static int subInt(int a,int b) {
		return a-b;
	}
	public static int mulInt(int a,int b) {
		return a*b;
	}
	public static int divInt(int a,int b) {
		return a/b;
	}
	
	public static float addFloat(float a,float b) {
		return a+b;
	}
	public static float subFloat(float a,float b) {
		return a-b;
	}
	public static float mulFloat(float a,float b) {
		return a*b;
	}
	public static float divFloat(float a,float b) {
		return a/b;
	}
	
	public static double addDouble(double a,double b) {
		return a+b;
	}
	public static double subDouble(double a,double b) {
		return a-b;
	}
	public static double mulDouble(double a,double b) {
		return a*b;
	}
	public static double divDouble(double a,double b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println(addInt(a,b));
		System.out.println(addFloat(a,b));
		System.out.println(addDouble(a,b));
	}

}
