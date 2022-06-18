/**
 * 
 */
package com.shadab.ds.array;

/**
 * @author moshadab
 *
 */
public class ArrayUtil<T> {

	public T[] reverse(T[] array) {
		int beg = 0;
		int end = array.length - 1;
		while (beg < end) {
			T tempData = array[beg];
			array[beg] = array[end];
			array[end] = tempData;
			beg++;
			end--;
		}
		return array;
	}

	public T[] reverse(T[] array, int beg, int end) {
		while (beg < end) {
			T tempData = array[beg];
			array[beg] = array[end];
			array[end] = tempData;
			beg++;
			end--;
		}
		return array;
	}
}
