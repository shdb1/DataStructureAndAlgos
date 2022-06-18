/**
 * 
 */
package com.shadab.ds.array.problems.arrangeandrearrange;

import com.shadab.ds.array.sort.MergeSort;

/**
 * @author moshadab
 *
 */
public class RearrangePosNegAlternative {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void arrange(int[] data) {
		MergeSort mergeSort = new MergeSort();
		data = mergeSort.mergeSort(data, 0, data.length - 1);
		int start=0,end=data.length - 1;
		while(start<end) {
			if(data[start]<0 && data[end]>0) {
				// normal condition
				int tempStart =data[end];
				int tempEnd =data[end];
				data[tempStart]=data[end];
				data[end]=tempEnd;
				start++;
				end--;
				
			}
			else {
				// counter matches finished now fill remaining in the end of the array .
				
			}
			
		}

	}
}
