package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input vector size: ");
		int size = sc.nextInt();
		int[] vector = new int[size];
		vectorPrint(vector);
		System.out.println("Here is the max: " + findMax(vector));
		sc.close();
	}

	static void vectorPrint(int[] arr) {
		System.out.println("Here is your vector: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

	static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] > max) {
				max = arr[i+ 1];
			}
		}
		return max;

	}

}
