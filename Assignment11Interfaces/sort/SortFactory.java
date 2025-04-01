package com.zoho.sort;

public class SortFactory {
	public static Sortable createSort(String str) {
		if(str==null) return null;
		else if(str.equals("bubbleSort")) return new BubbleSort();
		else if(str.equals("mergeSort")) return new MergeSort();
		else if(str.equals("quickSort")) return new BubbleSort();
		return null;
	}
}
