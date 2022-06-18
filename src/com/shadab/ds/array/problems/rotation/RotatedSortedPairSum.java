/**
 * 
 */
package com.shadab.ds.array.problems.rotation;

/**
 * @author moshadab
 *
 */
public class RotatedSortedPairSum {

	public static void main(String[] args) {
		int arr[] = { 11, 15, 6, 8, 9, 10 };
		int x = 16;
		int arr2[] = { 11, 15, 26, 38, 9, 10 };
		int x2 = 45;
		System.out.println(rotatedPairSum(arr, x));
		System.out.println(rotatedPairSum(arr2, x2));
	}

	public static boolean rotatedPairSum(int arr[], int sum) {
		// find the peak point in the array: in sorted rotated array peak cant be on the
		// corners
		int peakIndex = 0, smallestIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[i + 1]) {
				peakIndex = i;
				smallestIndex = i + 1;
				break;
			}
		}
// we got the peak and smallest now lets run two pinters 
		while (peakIndex != smallestIndex) {
			if (arr[peakIndex] + arr[smallestIndex] == sum) {
				System.out.println("Items are " + arr[peakIndex] + " and " + arr[smallestIndex]);
				return true;
			}
			if (arr[peakIndex] + arr[smallestIndex] > sum) {
				peakIndex = (arr.length + peakIndex - 1) % arr.length;

			}
			if (arr[peakIndex] + arr[smallestIndex] < sum) {
				smallestIndex = (smallestIndex + 1) % arr.length;
			}

		}
		return false;
	}
}
