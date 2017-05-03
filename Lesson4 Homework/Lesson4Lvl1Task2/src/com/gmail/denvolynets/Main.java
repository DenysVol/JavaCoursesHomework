package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input n: ");
		int n = sc.nextInt();
		if (n > 4 & n < 16){
			for (int i = n - 1; i > 0; i--) {
				n *= i;
			}
			System.out.println("n! = " + n);
		}else{
			System.out.println("Wrong value");
		}
		sc.close();
	}
}
