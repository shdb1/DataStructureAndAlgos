/**
 * 
 */
package com.shadab.ds.array.problems;

/**
 * @author moshadab Given an unsorted array of positive integers, find the
 *         number of triangles that can be formed with three different array
 *         elements as three sides of triangles. For a triangle to be possible
 *         from 3 values, the sum of any of the two values (or sides) must be
 *         greater than the third value (or third side). Input : [4, 1, 2]
 *         Output : No No triangle is possible from given array values
 * 
 *         Input : [5, 4, 3, 1, 2] Output : Yes Sides of possible triangle are 2
 *         3 4
 * 
 */
public class PossibleTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 4, 3, 1, 2 };
		System.out.println(possibleTriangle(arr));

	}

	static boolean possibleTriangle(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < arr.length; j2++) {
					if ((arr[i] + arr[j] > arr[j2]) && (arr[j] + arr[j2] > arr[i]) && (arr[j2] + arr[i] > arr[j]))
						return true;
				}
			}
		}
		return false;
	}
	
	static boolean possibleTriangle2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < arr.length; j2++) {
					if ((arr[i] + arr[j] > arr[j2]) && (arr[j] + arr[j2] > arr[i]) && (arr[j2] + arr[i] > arr[j]))
						return true;
				}
			}
		}
		return false;
	}

}
