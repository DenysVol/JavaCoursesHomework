package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input length: ");
		int length = sc.nextInt();
		System.out.println("Input width: ");
		int width = sc.nextInt();
		printFigure(length, width);
		sc.close();
	}

	static void printFigure(int len, int wid) {

		if (len > 0 && wid > 0) {
			for (int i = 1; i <= len; i++) {
				for (int j = 1; j <= wid; j++) {
					if (i == 1 || j == 1 || i == len || j == wid) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("Error");
		}
	}
}
