/**
 * 
 */
package com.shadab.ds.array.search;

import com.shadab.algos.search.Search;

/**
 * @author moshadab
 *
 */
public class SortedArraySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Binary Search
		int sortedArray[] = { 1, 2, 3, 5, 33 };
		int sortedArray2[] = { 1, 2, 3, 5, 33, 44,55,66,99 };
		System.out.println("*********************Binary Search**********************");
		BinarySearch binarySearch = new BinarySearch();
		System.out.println("Index of item:" + binarySearch.search(sortedArray, 2));
		System.out.println("Index of item:" + binarySearch.search(sortedArray, 5));
		System.out.println("Index of item:" + binarySearch.search(sortedArray2, 33));
		System.out.println("*********************Jump Search**********************");
		JumpSearch jumpSearch = new JumpSearch();
	    System.out.println("Index of item:" + jumpSearch.search(sortedArray, 2));
		System.out.println("Index of item:" + jumpSearch.search(sortedArray, 5));
		System.out.println("Index of item:" + jumpSearch.search(sortedArray2, 33));
		System.out.println("Index of item:" + jumpSearch.search(sortedArray2, 55));

	}

}

// Log(n)
class BinarySearch implements Search {

	@Override
	public int search(int[] arr, int element) {
		// TODO Auto-generated method stub
		return binarySearch(arr, element, 0, arr.length - 1);
	}

	int binarySearch(int[] arr, int element, int start, int end) {
		System.out.println("start:" + start + ",end:" + end);
		int location = -1;
		if (arr[start] == element)
			location = start;
		else if (arr[end] == element)
			location = end;
		else {

			int pivot = getPivot(start, end);
			System.out.println("pivot" + pivot);
			if (element <= arr[pivot])
				location = binarySearch(arr, element, start, pivot);
			else
				location = binarySearch(arr, element, pivot, end);
		}
		return location;
	}

	int getPivot(int start, int end) {
		int sumIndex = start + end;
		if (sumIndex % 2 == 0)
			return sumIndex / 2;
		else
			return (sumIndex / 2) + 1;
	}

}

// lies between o(n) and o(logn)
class JumpSearch implements Search {

	@Override
	public int search(int[] arr, int element) {
		// TODO Auto-generated method stub
		int jumpSize = (int) Math.sqrt(arr.length);
		System.out.println("jumpSize" + jumpSize);
		return jumpSearch(arr, element, jumpSize, 0);

	}

	int jumpSearch(int[] arr, int element, int jumpSize, int start) {
		int location = -1;
		int nextJump = start+jumpSize;
		System.out.println("Next Jump:"+nextJump);
		if (location!=-1) {
			return location;
		}
		else if (element > arr[nextJump]) {
			return jumpSearch(arr, element, jumpSize, nextJump);
		}
		else {
			for (int index = start; index <= nextJump; index++) {
				if (arr[index] == element) {
					location = index;
					break;
				}
				

			}
		}

		return location;
	}

}

