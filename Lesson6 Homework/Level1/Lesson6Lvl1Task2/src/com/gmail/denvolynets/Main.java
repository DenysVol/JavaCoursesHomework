package com.gmail.denvolynets;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		double b = 15.5;
		String c = "Hello";
		System.out.println(toConcatenate(a, b, c));
	}
	
	static String toConcatenate(int a, double b, String c){
		return c = a + (b + c);
	}
	
}
