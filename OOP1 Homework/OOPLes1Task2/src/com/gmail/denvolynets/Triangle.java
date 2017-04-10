package com.gmail.denvolynets;

public class Triangle {
	private int a;
	private int b;
	private int c;

	public Triangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getArea() {
		double area = 0;
		double p = 0;
		System.out.println("Let's find area of triange ");
		if (a + b > c && a + c > b && b + c > a){
			p = 0.5 * (a + b + c);
			area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			System.out.println("The area is " + area + ".");
		} else {
			System.out.println("Triangle doesn't exist");
		}
		System.out.println();
		return area;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
}
