/**
 * 
 */
package com.shadab.ds.array.sort;

import com.shadab.algos.sorting.Sort;

/**
 * @author moshadab
 *
 */
//o(n^2) - Each element check to left and go till beginning like cards
public class InsertionSort implements Sort {

	@Override
	public int[] sort(int[] inputArray) {
		// TODO Auto-generated method stub
		for (int itemToBeComparedIndex = 1; itemToBeComparedIndex < inputArray.length; itemToBeComparedIndex++) {
			int minimumIndex = itemToBeComparedIndex;
			for (int arrayItemIndex = itemToBeComparedIndex - 1; arrayItemIndex >= 0; arrayItemIndex--) {
				if (inputArray[arrayItemIndex] > inputArray[itemToBeComparedIndex]) {
					// swap
					int temp = inputArray[itemToBeComparedIndex];
					inputArray[itemToBeComparedIndex] = inputArray[minimumIndex];
					inputArray[minimumIndex] = temp;
				}
			}

		}

		return inputArray;
	}

}
