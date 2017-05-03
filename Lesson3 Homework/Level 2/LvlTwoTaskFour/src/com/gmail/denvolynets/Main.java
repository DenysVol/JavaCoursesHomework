package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 6-digit number: ");
		int num = sc.nextInt();
		int leftDigit = num / 100000;
		int rightDigit = num % 10;
		if (leftDigit == rightDigit) {
			leftDigit = num / 10000 % 10;
			rightDigit = num / 10 % 10;
			if (leftDigit == rightDigit) {
				leftDigit = num / 1000 % 10;
				rightDigit = num / 100 % 10;
				if (leftDigit == rightDigit) {
					System.out.println("This number is palindrome");
				} else {
					System.out.println("It's not palindrome");
				}
			} else {
				System.out.println("It's not palindrome");
			}
		} else {
			System.out.println("It's not palindrome");
		}
		sc.close();
	}

}
