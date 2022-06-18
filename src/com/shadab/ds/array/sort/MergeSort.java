/**
 * 
 */
package com.shadab.ds.array.sort;

import com.shadab.algos.sorting.Sort;

/**
 * @author moshadab
 *
 */
//All three goes as O(n log(n))
public class MergeSort implements Sort {

	@Override
	public int[] sort(int[] inputArray) {
		// TODO Auto-generated method stub
		mergeSort(inputArray, 0, inputArray.length-1);
		return inputArray;
	}

	public int[] mergeSort(int[] inputArray, int start, int end) {

		if (start < end) {

			int middle = start + (end - start) / 2;
			mergeSort(inputArray, start, middle);
			mergeSort(inputArray, middle + 1, end);
			merge(inputArray, start, end, middle);
		}

		return inputArray;
	}

	 void merge(int[] inputArray, int start, int end, int middle) {
		int leftArraySize = middle - start + 1;
		int rightArraySize = end - middle;
		int[] leftArray = new int[leftArraySize];
		int[] rightArray = new int[rightArraySize];
		// create Left and Right array
		for (int i = 0; i < leftArraySize; ++i) {
			leftArray[i] = inputArray[start + i];
		}
		for (int i = 0; i < rightArraySize; ++i) {
			rightArray[i] = inputArray[middle  +1+ i];
		}
		int leftArrayIndex = 0, rightArrayIndex = 0;
		int postComparisonFiller= start;

		while (leftArrayIndex < leftArraySize && rightArrayIndex < rightArraySize) {
			if (leftArray[leftArrayIndex] <= rightArray[rightArrayIndex]) {
				inputArray[postComparisonFiller] = leftArray[leftArrayIndex];
				leftArrayIndex++;
			} else {
				inputArray[postComparisonFiller] = rightArray[rightArrayIndex];
				rightArrayIndex++;
			}
			postComparisonFiller++;
		}

		// fill the pending items
		while( leftArrayIndex < leftArraySize) {
			inputArray[postComparisonFiller] = leftArray[leftArrayIndex];
			leftArrayIndex++;
			postComparisonFiller++;
		}
		while( rightArrayIndex < rightArraySize) {
			inputArray[postComparisonFiller] = rightArray[rightArrayIndex];
			rightArrayIndex++;
			postComparisonFiller++;
		}

	}

}