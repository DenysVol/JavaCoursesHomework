package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input text: ");
		String str = sc.nextLine();
		System.out.println("There are " + countWords(str) + " words in this text.");
		sc.close();
	}

	static int countWords(String text) {
		String[] t = text.split("[\\s\\.,\\?!]+");
		int num = t.length;
		return num;
	}

}
