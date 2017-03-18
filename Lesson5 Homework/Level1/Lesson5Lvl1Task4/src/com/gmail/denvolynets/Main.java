package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] s = str.toCharArray();
		int counter = 0;
		for (int i = 0; i < s.length; i++) {
			if(s[i] == 'b'){
				counter++;
			}
		}
		System.out.println(counter);
		sc.close();
	}

}
