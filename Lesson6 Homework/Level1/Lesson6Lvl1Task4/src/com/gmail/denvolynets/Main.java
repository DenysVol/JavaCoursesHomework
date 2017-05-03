package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input vector size: ");
		int size = sc.nextInt();
		int[] vector = new int[size];
		vectorPrint(vector);
		System.out.println("Input the number you want to find: ");
		int a = sc.nextInt();
		System.out.println("The index of this number is: " + findElement(vector, a));
		sc.close();
	}

	static void vectorPrint(int[] arr) {
		System.out.println("Here is your vector: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
			System.out.print(arr[i] + "  ");
		}
		System.out.println();
	}

	static int findElement(int[] arr, int a) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				index = i;
			}
			if(index == 0){
				index = -1;
			}
		}
		return index;
	}
}
