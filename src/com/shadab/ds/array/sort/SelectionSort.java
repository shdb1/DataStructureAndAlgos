/**
 * 
 */
package com.shadab.ds.array.sort;

import com.shadab.algos.sorting.Sort;

/**
 * @author moshadab
 *
 */
//o(n^2) - find min index for each item and swap
public class SelectionSort implements Sort {

	@Override
	public int[] sort(int[] inputArray) {
		// TODO Auto-generated method stub
		for (int itemToBeComparedIndex = 0; itemToBeComparedIndex < inputArray.length; itemToBeComparedIndex++) {
			int minimumIndex = itemToBeComparedIndex;
			for (int arrayItemIndex = itemToBeComparedIndex; arrayItemIndex < inputArray.length; arrayItemIndex++) {
				if (inputArray[arrayItemIndex] < inputArray[itemToBeComparedIndex])
					minimumIndex = arrayItemIndex;
			}
			// swap
			int temp = inputArray[itemToBeComparedIndex];
			inputArray[itemToBeComparedIndex] = inputArray[minimumIndex];
			inputArray[minimumIndex] = temp;
		}

		return inputArray;
	}

}
