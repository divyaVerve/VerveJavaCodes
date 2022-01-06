package com.vstl;

public class TestBubbleSort {

	public static void main(String[] args) {
		BubbleSort objBubbleSort = new BubbleSort();
        int array[] = {12, 65, 25, 4, 44, 18,78};
        objBubbleSort.bubbleSort(array);
        System.out.println("Sorted array");
        objBubbleSort.printArray(array);
	}

}
