package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int entrance;
		int floor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the apartment number:");
		int apartment = sc.nextInt();
		int everyFourth = apartment % 4;

		if (apartment > 0 && apartment <= 144 && everyFourth != 0) {
			entrance = apartment / 36 + 1;
			floor = (apartment - apartment / 36 * 36) / 4 + 1;
			System.out.println("The entrance number is = " + entrance);
			System.out.println("The floor number is = " + floor);
		} else if (apartment > 0 && apartment <= 144 && everyFourth == 0) {
			entrance = apartment / 37 + 1;
			floor = (apartment - apartment / 37 * 36) / 4;
			System.out.println("The entrance number is = " + entrance);
			System.out.println("The floor number is = " + floor);
		} else {
			System.out.println("Sorry, but there is no such apartment ");
		}
		sc.close();
	}
}
