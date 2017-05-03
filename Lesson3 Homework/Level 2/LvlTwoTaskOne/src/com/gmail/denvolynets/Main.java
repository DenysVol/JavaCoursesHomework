package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		int r = 4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the point: ");
		System.out.print("x1 = ");
		int x1 = sc.nextInt();
		System.out.print("y1 = ");
		int y1 = sc.nextInt();
		if (Math.sqrt((Math.pow(x1, 2)+(Math.pow(y1, 2)))) <= r){
			System.out.println("The point is inside the circle");
		}else{
			System.out.println("The point is outside the circle");
		}
		sc.close();
	}
	
}
