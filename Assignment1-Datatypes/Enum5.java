package com.zoho;

import java.util.Scanner;

public class Enum5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		System.out.println(Weekdays.values()[day-1]);
	}
	public enum Weekdays{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	}

}
