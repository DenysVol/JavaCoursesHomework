package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input width: ");
		int width = sc.nextInt();
		if (width % 2 != 0 && width > 0) {
			for (int i = 0; i < width; i++) {

				for (int j = 0; j < width; j++) {

					if (j >= i & i < width - j) {
						System.out.print("*");
					} else if (j <= i & i > width - j - 2) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

				System.out.println();

			}
		}else{
			System.out.println("Width should be odd number");
		}
		sc.close();
	}
}
