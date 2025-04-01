package com.zoho.sort;

public class BubbleSort implements Sortable{
	public void sort(int[] arr) {
		int n = arr.length;    
        int temp = 0;    
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
	}
}
