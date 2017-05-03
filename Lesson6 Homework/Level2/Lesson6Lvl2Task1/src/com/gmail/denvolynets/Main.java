package com.gmail.denvolynets;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int counter = 0;
		
		int[] firstArr = new int[7];
		int[] secondArr = new int[5];
		int[] thirdArr = new int[6];
		int[] fourthArr = new int[4];
		int[] fifthArr = new int[5];
		int[] sixthArr = new int[5];

		fillFirstArr(firstArr);
		printArr(firstArr);
		fillSecondArr(secondArr);
		printArr(secondArr);
		fillThirdArr(thirdArr);
		printArr(thirdArr);
		fillFourthArr(fourthArr);
		printArr(fourthArr);
		fillFifthArr(fifthArr);
		printArr(fifthArr);
		fillSixthArr(sixthArr);
		printArr(sixthArr);
		
		System.out.println("Input array size");
		int size = sc.nextInt();
		int[] testArr = new int[size];
		System.out.println("Input elements :");
		for (int i = 0; i < testArr.length; i++) {
			testArr[i] = sc.nextInt();
		}
		int[] newArr = Arrays.copyOf(testArr,testArr.length + 1);
		for (int i = 0; i < 6; i++) {

			if (i == 0 & flag == false) {
				flag = iterator(testArr, firstArr);
				counter = i;
			}
			if (i == 1 & flag == false) {
				flag = iterator(testArr, secondArr);
				counter = i;
			}
			if (i == 2 & flag == false) {
				flag = iterator(testArr, thirdArr);
				counter = i;
			}
			if (i == 3 & flag == false) {
				flag = iterator(testArr, fourthArr);
				counter = i;
			}
			if (i == 4 & flag == false) {
				flag = iterator(testArr, fifthArr);
				counter = i;
			}
			if (i == 5 & flag == false) {
				flag = iterator(testArr, sixthArr);
				counter = i;
			}
		}

		switch (counter) {
		case 0:
			fillFirstArr(newArr);
			System.out.println(newArr[newArr.length - 1]);
			break;
		case 1:
			fillSecondArr(newArr);
			System.out.println(newArr[newArr.length - 1]);
			break;
		case 2:
			fillThirdArr(newArr);
			System.out.println(newArr[newArr.length - 1]);
			break;
		case 3:
			fillFourthArr(newArr);
			System.out.println(newArr[newArr.length - 1]);
			break;
		case 4:
			fillFifthArr(newArr);
			System.out.println(newArr[newArr.length - 1]);
			break;
		case 5:
			fillSixthArr(newArr);
			System.out.println(newArr[newArr.length - 1]);
			break;
		}
		sc.close();
	}

	static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				System.out.print(arr[i] + ",");
			} else {
				System.out.println(arr[i]);
			}
		}
	}

	static boolean iterator(int[] arr, int[] oldArr) {
		boolean flag = false;
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (oldArr[i] == arr[i]) {
				counter++;
			}
		}
		if (counter == arr.length) {
			flag = true;
		}
		return flag;
	}
	
	static void fillFirstArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 2;
		}
	}

	static void fillSecondArr(int[] arr) {
		arr[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] + 3;
		}
	}

	static void fillThirdArr(int[] arr) {
		arr[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] * 2;
		}
	}

	static void fillFourthArr(int[] arr) {
		arr[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] * 3;
		}
	}

	static void fillFifthArr(int[] arr) {
		arr[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = (int) Math.pow(i + 1, 2);
		}
	}

	static void fillSixthArr(int[] arr) {
		arr[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = (int) Math.pow(i + 1, 3);
		}
	}
}
