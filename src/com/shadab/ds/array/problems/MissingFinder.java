package com.shadab.ds.array.problems;

/**
 * @author moshadab
 *
 *         You are given a list of n-1 integers and these integers are in the
 *         range of 1 to n. There are no duplicates in the list. One of the
 *         integers is missing in the list. Write an efficient code to find the
 *         missing integer.
 *         C: All goes o(n)
 */
public class MissingFinder {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 8,6, 7, 9, 10 };
		System.out.println(findMissingUsingSummation(arr));
		System.out.println(getMissingByAvoidingOverflow(arr,9));
	}

	static int findMissingUsingSummation(int[] arr) {
		// n(n+1)/2 to get sum of a range of numbers
		int expectedSum = (arr.length + 1) * (arr.length + 1 + 1) / 2;
		int actualSum = 0;
		for (int i = 0; i < arr.length; i++) {
			actualSum = actualSum + arr[i];
		}

		return expectedSum - actualSum;
	}
	// there can be overflow on int variable so we are using add/substratc same time
	 static int getMissingByAvoidingOverflow(int a[], int n)
	    {
	        int total = 2;
	        for (int i = 3; i <= (n + 1); i++)
	        {
	            total =total+ i -a[i - 2];
	            //total =total- a[i - 2];
	        }
	        return total;
	    }

}
