package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of columns: ");
		int value = sc.nextInt();
		if (value > 0) {
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= value; j++) {
					if (j % 2 == 1) {
						System.out.print("***");
					} else {
						System.out.print("+++");
					}
				}
				System.out.println();
			}
		}else{
			System.out.println("Wrong number");
		}
		sc.close();
	}

}
