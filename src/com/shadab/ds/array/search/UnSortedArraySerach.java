/**
 * 
 */
package com.shadab.ds.array.search;

import com.shadab.algos.search.Search;

/**
 * @author moshadab
 *
 */
public class UnSortedArraySerach implements Search{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unsortedArray[] = { 3, 2, 33, 5, 1 };
		UnSortedArraySerach sortedArraySerach = new UnSortedArraySerach();
		System.out.println(sortedArraySerach.search(unsortedArray, 2));
	}

	
// O(n)- Linear
	@Override
	public int search(int[] A, int K) {
		// TODO Auto-generated method stub

		for (int i = 0; i < A.length; i++) // For each element
			if (A[i] == K) // if we found it
				return i; // return this position
		return A.length; // Otherwise, return the array length
	
	}

}
