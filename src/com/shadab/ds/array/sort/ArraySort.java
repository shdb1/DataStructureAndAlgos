package com.shadab.ds.array.sort;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {

		int unsortedArray[] = { 3, 2, 33, 5, 1 };
		System.out.println("*********************Bubble Sort**********************");
		BubbleSort bubbleSort = new BubbleSort();
		System.out.println("Output:" + Arrays.toString(bubbleSort.sort(unsortedArray)));
		System.out.println("*********************Selection Sort**********************");
		SelectionSort selectionSort = new SelectionSort();
		System.out.println("Output:" + Arrays.toString(selectionSort.sort(unsortedArray)));
		System.out.println("*********************Insertion Sort**********************");
		InsertionSort insertionSort = new InsertionSort();
		System.out.println("Output:" + Arrays.toString(insertionSort.sort(unsortedArray)));
		System.out.println("*********************Merge Sort**********************");
		MergeSort mergeSort = new MergeSort();
 		 System.out.println("Output:" +Arrays.toString(mergeSort.sort(unsortedArray)));
	}
}









