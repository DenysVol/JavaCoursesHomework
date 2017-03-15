package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input length: ");
		int length = sc.nextInt();
		System.out.println("Input width: ");
		int width = sc.nextInt();
		if (length > 0 && width > 0) {
			for (int i = 1; i <= length; i++) {
				for (int j = 1; j <= width; j++) {
					if (i == 1 || j == 1 || i == length || j == width) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}else{
			System.out.println("Error");
		}
		sc.close();
	}
}
