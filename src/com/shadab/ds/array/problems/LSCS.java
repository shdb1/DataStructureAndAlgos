/**
 * 
 */
package com.shadab.ds.array.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author moshadab
 *
 */
public class LSCS {
	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int[] a2 = { -2, -1, -5, -3 };
		int[] a3 = { -1, 2, 3, -4, 5, 10 };
		int[] a4 = { 1, 2, 3, 4 };
		int[] a5 = { 2, -1, 2, 3, 4, -5 };
		LSCS lscs = new LSCS();
		System.out.println("************* Longest subarray contageous sum *******************");
		System.out.println(lscs.findLCS(a));
		System.out.println(lscs.findLCS(a2));
		System.out.println(lscs.findLCS(a3));
		System.out.println(lscs.findLCS(a4));
		System.out.println(lscs.findLCS(a5));
		System.out.println("************* Longest subarray subsequences sum *******************");
		System.out.println(lscs.findSubArrays(Arrays.stream(a).boxed().collect(Collectors.toList())));
		System.out.println(lscs.findSubArrays(Arrays.stream(a2).boxed().collect(Collectors.toList())));
		System.out.println(lscs.findSubArrays(Arrays.stream(a3).boxed().collect(Collectors.toList())));
		System.out.println(lscs.findSubArrays(Arrays.stream(a4).boxed().collect(Collectors.toList())));
		System.out.println(lscs.findSubArrays(Arrays.stream(a5).boxed().collect(Collectors.toList())));
		
        
	}

	public int findLCS(int[] array) {
		int globalMax = Integer.MIN_VALUE;
		int sumOfElement = 0;
		for (int elementIndex = 0; elementIndex < array.length; elementIndex++) {

			if (array[elementIndex] > sumOfElement + array[elementIndex]) {
				// if current element is greater than previous sum then start from here
				sumOfElement = array[elementIndex];
			} else {
				// otherwise continue and update the values
				sumOfElement = sumOfElement + array[elementIndex];

			}
			if (globalMax < sumOfElement)
				globalMax = sumOfElement;

		}

		return globalMax;
	}

	// Maximum sub array : https://www.hackerrank.com/challenges/maxsubarray/problem

	public List<Integer> findSubArrays(List<Integer> array) {
		int globalMax = Integer.MIN_VALUE;
		int sumOfElement = 0;
		int sumOfPostive = 0;
		for (int elementIndex = 0; elementIndex < array.size(); elementIndex++) {

			if (array.get(elementIndex) > sumOfElement + array.get(elementIndex)) {
				// if current element is greater than previous sum then start from here
				sumOfElement = array.get(elementIndex);
			} else {
				// otherwise continue and update the values
				sumOfElement = sumOfElement + array.get(elementIndex);

			}
			if (globalMax < sumOfElement)
				globalMax = sumOfElement;

			// susequence logic goes here
			if (array.get(elementIndex) > 0)
				sumOfPostive = sumOfPostive + array.get(elementIndex);

		}
		List<Integer> result = new ArrayList<Integer>();
		result.add(globalMax);
		if (globalMax < 0)
			result.add(globalMax);
		else
			result.add(sumOfPostive);

		return result;
	}

}
