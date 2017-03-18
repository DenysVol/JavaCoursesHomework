package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the deegre you want to rotate the matrix:");
		System.out.println("Input 1 for 90");
		System.out.println("Input 2 for 180");
		System.out.println("Input 3 for 360");
		int n = sc.nextInt();

		int[][] array = new int[6][6];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = j;
			}
		}
		switch (n) {
		case (1):
			for (int i = 0; i < array.length; i++) {
				for (int j = i; j < array.length; j++) {
					int temp = array[i][j];
					array[i][j] = array[j][i];
					array[j][i] = temp;
				}
			}
			break;
		case (2):
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length / 2; j++) {
					int temp = array[i][j];
					array[i][j] = array[i][array.length - j - 1];
					array[i][array.length - j - 1] = temp;

				}
			}
			break;
		case (3):
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length / 2; j++) {
					int temp = array[i][j];
					array[i][j] = array[i][array.length - j - 1];
					array[i][array.length - j - 1] = temp;

				}
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = i; j < array.length; j++) {
					int temp = array[i][j];
					array[i][j] = array[j][i];
					array[j][i] = temp;
				}
			}
			break;
		}
		if (n > 0 & n < 4) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					System.out.print(array[i][j]);
				}
				System.out.println();
			}
		}else{
			System.out.println("Wrong number. Input 1, 2 or 3");
		}
		sc.close();
	}

}
