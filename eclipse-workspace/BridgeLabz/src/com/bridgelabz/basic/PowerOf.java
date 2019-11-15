package com.bridgelabz.basic;

public class PowerOf {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int i = 0;// intial value should start with 0
		int poweroftwo = 1;
		while (i <= n) {
			System.out.println(i + " " + poweroftwo);
			poweroftwo = 2 * poweroftwo;
			i = i + 1;
		}

	}
}
