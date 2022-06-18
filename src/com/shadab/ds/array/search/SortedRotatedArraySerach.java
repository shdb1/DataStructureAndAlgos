/**
 * 
 */
package com.shadab.ds.array.search;

import com.shadab.algos.search.Search;

/**
 * @author moshadab
 *
 */
public class SortedRotatedArraySerach implements Search {
	
	
	public static void main(String[] args) {
		SortedRotatedArraySerach sortedRotatedArraySerach = new SortedRotatedArraySerach();
		int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		System.out.println("Index of item:" + sortedRotatedArraySerach.search(arr, 1));
	}
	
	@Override
	public int search(int[] arr, int element) {
		// TODO Auto-generated method stub
		// lets use pivot and either of array divided by pivot will be the sorted one
		// and ll help to execute a quick check if our element is available in that
		// otherwise otherside.
		return binarySerachForSortedRotated(arr, element, 0, arr.length-1);
	}

	int binarySerachForSortedRotated(int[] arr, int element, int beg, int end) {

		int mid = beg + (end - beg) / 2;
		if (arr[mid] == element) {
			return mid;
		}
		// check if left array is sorted
		if(arr[beg]<=arr[mid]) {
			// this is sorted
			if(arr[beg] <= element && arr[mid] >= element) {
				return binarySerachForSortedRotated(arr, element, beg, mid);
			}
			else {
				return binarySerachForSortedRotated(arr, element, mid+1, end);
			}
		}
	 if (arr[mid+1]<=arr[end]){
			// other side is sorted
			if(arr[mid+1] <= element && arr[end] >= element) {
				return binarySerachForSortedRotated(arr, element, mid+1, end);
			}
			else {
				return binarySerachForSortedRotated(arr, element, beg, mid);
			}
			
		}
		return -1;

	}
}