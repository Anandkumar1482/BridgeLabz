package com.bridgelabz.algorithm;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 9, 8, 7, 5, 6 };
		System.out.println("Before sorting Elements");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		// After Swapping to print the values
		bubbleSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void bubbleSort(int[] a) {
		int temp = 0;
		System.out.println("After sorting Elements");
		for (int i = 0; i < a.length; i++)//
		{
			for (int j = 1; j < (a.length) - i; j++) {
				// To compare Adjacent elements
				if (a[j - 1] > a[j]) {
					// After comparint to sort the elements based on ascendig order
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}

