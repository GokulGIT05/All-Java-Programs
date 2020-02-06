package com.gk1.jbPrograms;

import java.util.Arrays;

public class Gk3SortUsingMath {

	public static void main(String[] args) {

		// Sort neglecting minus.

		int[] toSort = { 6, 3, 0, -5, -2 };
		
		System.out.println("Before Sorting: "+Arrays.toString(toSort));

		int[] sortedArray = sortUsingBubbleSort(toSort);
		System.out.println("After Sorting: "+Arrays.toString(sortedArray));
	}

	private static int[] sortUsingBubbleSort(int[] toSort) {

		// Bubble Sort Algorithm.
		for (int i = 0; i < toSort.length; i++) {

			for (int j = 0; j < toSort.length -1 - i; j++) {

				if (Math.abs(toSort[j]) > Math.abs(toSort[j + 1])) {
					// Swap Function
					int temp = toSort[j];
					toSort[j] = toSort[j + 1];
					toSort[j + 1] = temp;
				}
			}
		}

		return toSort;
	}

}
