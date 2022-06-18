/**
 * 
 */
package com.shadab.ds.array.problems.rotation;

import java.util.Arrays;

/**
 * @author moshadab
 *
 */
public class RotationWithMxHammingDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 8, 3 };
		int a2[] = { 2, 4, 8, 0 };
		int a3[] = { 1, 4, 1 };
		RotationWithMxHammingDistance rotationWithMxHammingDistance = new RotationWithMxHammingDistance();
		System.out.println(rotationWithMxHammingDistance.rotateForMaxHammingDIstance(a));
		System.out.println(rotationWithMxHammingDistance.rotateForMaxHammingDIstance(a2));
		System.out.println(rotationWithMxHammingDistance.rotateForMaxHammingDIstance(a3));

	}

	public int rotateForMaxHammingDIstance(int[] array) {
		int hammingDistance = 0;
		int[] rotatedArray = new int[array.length];
		rotatedArray = Arrays.copyOf(array, array.length);
		int rotations = array.length - 1;
		while (rotations > 0) {
			int temp = rotatedArray[rotatedArray.length - 1];

			for (int i = rotatedArray.length - 1; i > 0; i--) {
				rotatedArray[i] = rotatedArray[i - 1];
			}
			rotatedArray[0] = temp;

			rotations--;
		}

		for (int i = 0; i < rotatedArray.length; i++) {
			if (rotatedArray[i] != array[i])
				hammingDistance++;

		}
		return hammingDistance;
	}

}
