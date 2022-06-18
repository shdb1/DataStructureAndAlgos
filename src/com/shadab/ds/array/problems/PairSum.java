/**
 * 
 */
package com.shadab.ds.array.problems;

import com.shadab.ds.array.sort.ArraySort;
import com.shadab.ds.array.sort.MergeSort;

/**
 * @author moshadab
 *
 */
public class PairSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, -1, 2, -3, 1};
		int arr2[] = {1, -2, 1, 0, 5};
		System.out.println("*************** o(n^2) pair sum finder 1");
		System.out.println("Exsist: "+pairSumMethod1(arr, -2));
		System.out.println("*************** o(n^2) pair sum finder 2");
		System.out.println("Exsist: "+pairSumMethod1(arr, -40));
		System.out.println("*************** o(n^2) pair sum finder 3");
		System.out.println("Exsist: "+pairSumMethod1(arr2, 0));
	}

	// T : o(n^2) , S: o(1) - Method 1 (BF)
	static boolean pairSumMethod1(int[] array, int sum)

	{
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] + array[j] == sum) {
					System.out.println("Sum is available with elements : " + array[i] + " and " + array[j]);
					return true;
				}
			}
		}
		return false;

	}
	
	// T : o(nlogn+n= nlogn) , S: o(1) - Method 2 (sort and find)
		static boolean pairSumMethod2(int[] array, int sum)

		{
			// mergesort
		MergeSort mergeSort = new MergeSort();
		array=mergeSort.sort(array);
			return false;

		}

}
