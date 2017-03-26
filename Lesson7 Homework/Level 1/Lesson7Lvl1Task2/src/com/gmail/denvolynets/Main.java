package com.gmail.denvolynets;

public class Main {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.println(ownToString(a));
	}

	static String ownToString(int[] arr) {
		String finalStr = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				finalStr += arr[i] + ", ";
			} else {
				finalStr += arr[arr.length - 1] + "]";
			}
		}
		return finalStr;
	}

}
