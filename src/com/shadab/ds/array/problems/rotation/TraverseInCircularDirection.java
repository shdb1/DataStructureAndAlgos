/**
 * 
 */
package com.shadab.ds.array.problems.rotation;

/**
 * @author moshadab
 *
 */
public class TraverseInCircularDirection {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int startIngindex = 2;
		int numberOfTraversalRounds = 10;
		traverseInAntiClockDirection(a, startIngindex, numberOfTraversalRounds);
		traverseInClockDirection(a, startIngindex, numberOfTraversalRounds);

	}

	static void traverseInAntiClockDirection(int a[], int startIngindex, int numberOfTraversalRounds) {
		int index = startIngindex;
	while(numberOfTraversalRounds>0) {
		do {
			System.out.println(a[index]);
			index = (index + 1) % a.length;
		} while (index != startIngindex);
		System.out.println("traverseInAntiClockDirection Round:"+numberOfTraversalRounds+" Ended");
		numberOfTraversalRounds--;
	}
	}
	
	
	static void traverseInClockDirection(int a[], int startIngindex, int numberOfTraversalRounds) {
		int index = startIngindex;
	while(numberOfTraversalRounds>0) {
		do {
			System.out.println(a[index]);
			index = (a.length+index -1) % a.length;
		} while (index != startIngindex);
		System.out.println(" traverseInClockDirection Round:"+numberOfTraversalRounds+" Ended");
		numberOfTraversalRounds--;
	}
	}

}
