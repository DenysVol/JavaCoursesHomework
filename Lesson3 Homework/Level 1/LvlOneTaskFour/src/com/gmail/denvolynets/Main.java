package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a: ");
		int a = sc.nextInt();
		System.out.println("Input b: ");
		int b = sc.nextInt();
		System.out.println("Input c: ");
		int c = sc.nextInt();
		
		if(a + b > c && a + c > b && b + c > a){
			System.out.println("The triangle exists");
		}else{
			System.out.println("The triangle doesn't exist");
		}
		sc.close();
	}

}
