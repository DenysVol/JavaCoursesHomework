package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input vector size: ");
		int size = sc.nextInt();
		int[] vector = new int[size];
		System.out.println("Input values: ");
		for (int i = 0; i < vector.length; i++) {
			vector[i] = sc.nextInt();
		}
		System.out.println();
		for (int i = 0; i < vector.length / 2; i++) {
			int temp = vector[i];
			vector[i] = vector[vector.length - i - 1];
			vector[vector.length - i - 1] = temp;
		}
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
		sc.close();
	}

}
