/**
 * 
 */
package com.shadab.ds.array.problems.rotation;

/**
 * @author moshadab
 *
 */
public class FindMinInSortedRotaed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 6, 1, 2, 3, 4 };
		int[] a2 = { 1, 2, 3, 4 };
		int[] a3 = { 2, 1 };
		int[] a4= {5,1,2,3,4};

		FindMinInSortedRotaed findMinInSortedRotaed = new FindMinInSortedRotaed();
		
		  System.out.println("Minimum element is:" + findMinInSortedRotaed.getMin(a));
		  System.out.println("Minimum element is:" + findMinInSortedRotaed.getMin(a2));
		  System.out.println("Minimum element is:" + findMinInSortedRotaed.getMin(a3));
		 
		System.out.println("Minimum element is:" + findMinInSortedRotaed.getMin(a4));

	}

	public int getMin(int[] array) {

		return getMinByBinarySearch(array, 0, array.length - 1);

	}

	int getMinByBinarySearch(int[] array, int first, int last) {
		// not rotated
		if (array[first] < array[last])
			return array[first];
		if (first == last)
			return array[first];
		if ((last-first) == 1) {
			if (array[first] > array[last])
				return array[last];
			else
				return array[first];
		}

		int mid = first + (last - first) / 2;
		int min = Integer.MIN_VALUE;
		// if prev is big this is smallest
		if (array[mid - 1] > array[mid])
			return array[mid];
		else {
			// need to go left or right
			if (array[mid - 1] < array[0])
				min = getMinByBinarySearch(array, first, mid - 1);
			else
				min = getMinByBinarySearch(array, mid + 1, last);
		}

		return min;
	}
}
