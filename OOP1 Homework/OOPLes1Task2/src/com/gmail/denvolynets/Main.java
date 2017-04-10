package com.gmail.denvolynets;

public class Main {

	public static void main(String[] args) {
		Triangle trOne = new Triangle(5, 7, 9);
		Triangle trTwo = new Triangle(10, 1, 2);
		Triangle trThree = new Triangle(-1, 4, 4);
		Triangle trFour = new Triangle(6, 11, 13);
		
		trOne.getArea();
		trTwo.getArea();
		trThree.getArea();
		trFour.getArea();
	}

}
