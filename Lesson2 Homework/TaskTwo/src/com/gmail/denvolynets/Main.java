package com.gmail.denvolynets;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0.5;
		double b = 0.6;
		double c = 0.9;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		/** semiperimetr */
		double s = (a + b + c) / 2;
		
		
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		
		System.out.println("area = " + area);

	}

}
