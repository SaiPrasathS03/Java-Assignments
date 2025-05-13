package com.zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ArrayListMain {

	public static void main(String[] args) {
		/*
		 * 1. **Add and Retrieve Elements**:
   				Write a Java program that creates an `ArrayList` of strings. 
   				Add five different fruits to the list, then retrieve and print the third fruit in the list.
		 */
		List<String> list1 = new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Guava");
		list1.add("Orange");
		list1.add("MuskMelon");
		System.out.println("1. "+list1.get(2));
		
		/* 2.**Iterate and Remove Elements**:
   		Create a Java program that initializes an `ArrayList` of integers with the values {10, 20, 30, 40, 50}. 
   		Use an iterator to iterate through the list and remove all elements greater than 30. Print the modified list.*/
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		
		Iterator<Integer> it = list2.iterator();
		List<Integer> greaterThan = new ArrayList<>();
		while(it.hasNext()) {
			int num = it.next();
			if(num>30) {
				greaterThan.add(num);
			}
		}
		list2.removeAll(greaterThan);
		System.out.println("2. "+list2);
		
		/* 
		 * 3. **Search for an Element**:
   			Write a Java program that creates an `ArrayList` of characters. Add ten different characters to the list.
   			 Write a method that takes a character as an argument and returns the index
   			of the character in the list. If the character is not found, return -1.
		 * */
		
		List<Character> list3 = new ArrayList<>();
		char ch = 'w';
		list3.add('a');
		list3.add('b');
		list3.add('c');
		list3.add('c');
		list3.add('s');
		list3.add('f');
		list3.add('d');
		list3.add('q');
		list3.add('e');
		list3.add('q');
		System.out.println("3. "+getIndexOf(list3,ch));
		
		/*
		 * **Sort an ArrayList**:
   			Create a Java program that initializes an `ArrayList` of integers with random values between 1 and 100. 
   			Add ten integers to the list. Sort the list in ascending order and print the sorted list. 
		 */
		List<Integer> list4 = new ArrayList<>();
		
		Random rd = new Random();
		for(int i=0;i<10;i++) list4.add(rd.nextInt(100));
		System.out.println("4. Before Sorting: "+ list4);
		Collections.sort(list4);
		System.out.println("After Sorting: "+ list4);
		
		
		/*
		 * **Convert ArrayList to Array and Vice Versa**:
   			Write a Java program that initializes an `ArrayList` of strings with the values {"apple", "banana", "cherry"}. 
   			Convert the `ArrayList` to an array, print the array, 
   			then convert the array back to an `ArrayList` and print the `ArrayList`
		 */
		String[] arr =  {"apple", "banana", "cherry"};
		
		List<String> list5 = new ArrayList<>(Arrays.asList(arr));
		System.out.println("5. "+list5);
		
		String[] arr5 = list5.toArray(new String[3]);

		System.out.println("Array: " + Arrays.toString(arr5));
		
	}

	public static int getIndexOf(List<Character> list,char ch) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==ch) return i;
		}
		return -1;
	}
}
