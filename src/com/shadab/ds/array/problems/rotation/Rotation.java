/**
 * 
 */
package com.shadab.ds.array.problems.rotation;

import java.util.Arrays;

import com.shadab.ds.array.ArrayUtil;

/**
 * @author moshadab rotate(ar[], d, n) that rotates arr[] of size n by d
 *         elements.]
 * 
 *         { 1, 2, 3, 4, 5, 6, 7 }; // 3,4,5,6,7,1,2 // 6,7,1,2,3,4,5
 */
public class Rotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		// 3,4,5,6,7,1,2
		System.out.println(
				"rotateArrayByShiftForEachRotation : " + Arrays.toString(rotateArrayByShiftForEachRotation(arr, 2, 7)));
		System.out.println("rotateArrayByIntelligentInsert    : "
				+ Arrays.toString(rotateArrayByIntelligentInsert(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 2, 7)));
		System.out.println("rotateArrayByReversal             : "
				+ Arrays.toString(rotateArrayByReversal(new Integer[] { 1, 2, 3, 4, 5, 6, 7 }, 2, 7)));
		System.out.println("rotateArrayByReversalRight        : "
				+ Arrays.toString(rotateArrayByReversalRight(new Integer[] { 1, 2, 3, 4, 5, 6, 7 }, 2, 7)));
		System.out.println("cyclicRotataion/clockwise         : "
				+ Arrays.toString(cyclicRotataion(new Integer[] { 1, 2, 3, 4, 5, 6, 7 })));
	}

	// T o(n*d) , S o(1)
	static int[] rotateArrayByShiftForEachRotation(int arr[], int d, int n) {
		for (int i = 0; i < d; i++) {
			rotateByOneElement(arr);
		}
		return arr;
	}

	static int[] rotateByOneElement(int arr[]) {
		int intial = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = intial;
		return arr;
	}

	// T o(n+n) , S o(2) duplicate array
	static int[] rotateArrayByIntelligentInsert(int arr[], int d, int n) {
		int[] tempArray = new int[n];
		for (int i = 0; i < arr.length - d; i++) {
			tempArray[i] = arr[i + d];
		}
		for (int i = 0; i < d; i++) {
			tempArray[n - d + i] = arr[i];
		}
		return tempArray;
	}

	// T o(n) , S o(1)
	static Integer[] rotateArrayByReversal(Integer arr[], int d, int n) {
		ArrayUtil<Integer> arrayUtil = new ArrayUtil<>();
		arr = arrayUtil.reverse(arr, 0, d - 1);
		arr = arrayUtil.reverse(arr, d, n - 1);
		arr = arrayUtil.reverse(arr, 0, n - 1);
		return arr;
	}

	// T o(n) , S o(1)
	static Integer[] rotateArrayByReversalRight(Integer arr[], int d, int n) {
		ArrayUtil<Integer> arrayUtil = new ArrayUtil<>();
		arr = arrayUtil.reverse(arr, n - d, n - 1);
		arr = arrayUtil.reverse(arr, 0, n - d - 1);
		arr = arrayUtil.reverse(arr, 0, n - 1);
		return arr;
	}

	// T o(n) , S o(1) - use last index to make complete displacement
	static Integer[] cyclicRotataion(Integer arr[]) {
		int beg = 0, end = arr.length - 1;
		while (beg != end) {
			int temp = arr[beg];
			arr[beg] = arr[end];
			arr[end] = temp;
			beg++;

		}
		return arr;
	}

}
