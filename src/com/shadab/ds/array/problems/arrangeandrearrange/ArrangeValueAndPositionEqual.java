/**
 * 
 */
package com.shadab.ds.array.problems.arrangeandrearrange;

import java.util.Arrays;

/**
 * @author moshadab Rearrange an array such that arr[i] = i
 */
public class ArrangeValueAndPositionEqual {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		int[] arr = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
	              11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
		ArrangeValueAndPositionEqual arrangeValueAndPositionEqual = new ArrangeValueAndPositionEqual();

		System.out.println(Arrays.toString(arrangeValueAndPositionEqual.rearrangeNaive(ar)));
		System.out.println(Arrays.toString(arrangeValueAndPositionEqual.rearrangeNaiveSpaceImproved(ar)));
		System.out.println(Arrays.toString(arrangeValueAndPositionEqual.rearrangeImproved(ar)));
		
		System.out.println(Arrays.toString(arrangeValueAndPositionEqual.rearrangeNaive(arr)));
		System.out.println(Arrays.toString(arrangeValueAndPositionEqual.rearrangeNaiveSpaceImproved(arr)));
		System.out.println(Arrays.toString(arrangeValueAndPositionEqual.rearrangeImproved(arr)));



	}

// O(n2) and O(2)
	public int[] rearrangeNaive(int[] data) {
		int[] result = new int[data.length];
		for (int i = 0; i < data.length; i++) {
			boolean elementFound = false;
			for (int j = 0; j < data.length; j++) {
				if (i == data[j]) {
					result[i] = i;
					elementFound = true;
					break;
				} else {
					if (!elementFound)
						result[i] = -1;
				}
			}

		}
		return result;

	}

	// O(n2) and O(1)
	public int[] rearrangeNaiveSpaceImproved(int[] data) {
		for (int i = 0; i < data.length; i++) {
			boolean elementFound = false;
			for (int j = 0; j < data.length; j++) {
				if (i == data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
					elementFound = true;
					break;
				}
			}
			if (!elementFound) {
				if (data[i] != -1) {
					// its not -1 so put it to someother location
					int pusherIndex = i + 1;
					while (pusherIndex < data.length) {
						if (data[pusherIndex] == -1) {
							data[pusherIndex] = data[i];
							break;
						}
						pusherIndex++;
					}
				}

				data[i] = -1;
			}

		}
		return data;

	}
	
	// o(n)
	public int[] rearrangeImproved(int[] data) {
		
		for (int i = 0; i < data.length; i++) {
			if(!(-1== data[i] || data[i]==i)) {
				putOnPosition(data, i);
			}
			 
		}
		return data;
	}
	
	private void putOnPosition(int[] data,int index) {
		if(index==data[index] ||data[index]==-1 )
			return;
		else {
			int temp = data[data[index]];
			putOnPosition(data, temp);
		}
			
	}

}
