package com.bridgelabz.basic;

import java.util.Scanner;

public class PrimeFactors {
	/*
	 * Zero can never be a prime number as it can be divided by 1, and any other
	 * number. It has an infinite number of divisors and therefore doesn't meet the
	 * definition.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		number = sc.nextInt();

		for (int i = 2; i < number; i++) {
			while (number % i == 0) {
				System.out.println(i);
				number = number / i;
			}
		}
		if (number > 2) {
			System.out.println(number);
		}

	}

}
