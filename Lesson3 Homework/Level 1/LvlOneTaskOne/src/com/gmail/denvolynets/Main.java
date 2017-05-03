package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 1st number:");
		int first = sc.nextInt();
		System.out.println("Input 2nd number:");
		int second = sc.nextInt();
		System.out.println("Input 3rd number:");
		int third = sc.nextInt();
		System.out.println("Input 4th number:");
		int fourth = sc.nextInt();
		
		int max = first;
		if(second > max){
			max = second;
		}
		if(third > max){
			max = third;
		}
		if (fourth > max){
			max = fourth;
		}
		System.out.println("Max = " + max);
		sc.close();
	}

}
