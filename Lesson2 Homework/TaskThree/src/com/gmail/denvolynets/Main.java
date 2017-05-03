package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input r: ");
		double r = sc.nextDouble();
		double c = 2 * Math.PI * r;
		System.out.println("c = " + c);
		
		sc.close();
	}

}
