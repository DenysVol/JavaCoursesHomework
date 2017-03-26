package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		translate(sb);
		sc.close();
	}

	static boolean check(StringBuilder sb) {
		boolean flag = false;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '0' | sb.charAt(i) == '1') {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}

	static void translate(StringBuilder sb) {
		int result = 0;
		if (check(sb) == true) {
			for (int i = 0; i < sb.length(); i++) {
				if (sb.charAt(i) == '1') {
					result += Math.pow(2, i);
				}
			}
			System.out.println(result);
		} else {
			System.out.println("Wrong number");
		}
	}

}
