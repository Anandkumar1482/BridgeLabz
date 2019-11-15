package com.bridgelabz.algorithm;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int a[] = { 20, 30, 4, 40, 8, 90 };
		System.out.println("Before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println("After sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		binarySearch(a);
	}

	public static void binarySearch(int[] a) {
		int low = 0, high = 4;
		int key = 40, search = 0;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (key == a[mid]) {
				search++;
				break;
			} else if (key < a[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		if (search == 1)
			System.out.println(" key value is  " + key + "  found");
		else
			System.out.println(" key value is found");
	}
}




