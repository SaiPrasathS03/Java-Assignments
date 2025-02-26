package com.zoho;

public class TypeConversion2 {
	public static void main(String[] args) {
		byte a=10;
		short b=a;
		int c=b;
		long d=c;
		float e=d;
		double f=e;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		double a1 = 2000;
		float b1 = (float)a1;
		long c1 = (long)b1;
		int d1 = (int)c1;
		short e1 = (short)d1;
		byte f1 = (byte)e1;
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(e1);
		System.out.println(f1);
		
		
	}

}
