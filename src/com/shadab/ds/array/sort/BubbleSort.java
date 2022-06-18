/**
 * 
 */
package com.shadab.ds.array.sort;

import com.shadab.algos.sorting.Sort;

/**
 * @author moshadab
 *
 */

//o(n^2) - each item tp each
public class BubbleSort implements Sort {

	@Override
	public int[] sort(int[] inputArray) {
		// TODO Auto-generated method stub
		for (int itemToBeComparedIndex = 0; itemToBeComparedIndex < inputArray.length; itemToBeComparedIndex++) {
			for (int arrayItemIndex = 0; arrayItemIndex < inputArray.length; arrayItemIndex++) {
				if (inputArray[itemToBeComparedIndex] < inputArray[arrayItemIndex]) {
					// swap
					int temp = inputArray[arrayItemIndex];
					inputArray[arrayItemIndex] = inputArray[itemToBeComparedIndex];
					inputArray[itemToBeComparedIndex] = temp;
				}
			}
		}

		return inputArray;
	}

}
