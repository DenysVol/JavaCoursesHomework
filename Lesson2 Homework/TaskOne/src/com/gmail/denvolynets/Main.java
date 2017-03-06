package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the 5-digit number and press Enter");
		int value = sc.nextInt();
		int firstDigit = value / 10000;
		int secondDigit = value % 10000 / 1000;
		int thirdDigit = value % 1000 / 100;
		int fourthDigit = value % 100 / 10;
		int fifthDigit = value % 10;

		System.out.println("The Result is: ");
		System.out.println(firstDigit);
		System.out.println(secondDigit);
		System.out.println(thirdDigit);
		System.out.println(fourthDigit);
		System.out.println(fifthDigit);
		
		sc.close();
	}

}
