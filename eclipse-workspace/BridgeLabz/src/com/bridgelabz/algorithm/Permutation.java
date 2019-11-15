package com.bridgelabz.algorithm;

public class Permutation {
	public static void main(String[] args) {
		String str = "ABC"; // take input
		int n = str.length();
		Permutation p = new Permutation(); // creating object for the class
		p.permute(str, 0, n - 1); // to invoke a method by using object refernce
	}

	void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) { // Here l=left index position and r=right index position
				str = swap(str, l, i);
				// System.out.println("String value "+str);
				permute(str, l + 1, r); // to claculate permutation
				str = swap(str, l, i); // back tracking
				// System.out.println("String value "+str);

			}
		}
	}

	static String swap(String a, int i, int j) {
		char ch[] = a.toCharArray();
		// System.out.println("the a vlue is" +a);
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}
}
