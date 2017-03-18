package com.gmail.denvolynets;

import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the size of array: ");
		int size = sc.nextInt();
		int[] vector = new int[size];
		System.out.println("Input values: ");
		for (int i = 0; i < vector.length; i++) {
			vector[i] = sc.nextInt();
		}
		sc.close();
	}
	
}