package com.gmail.denvolynets;

public class Main {

	public static void main(String[] args) {
		Point pOne = new Point(1, 1);
		Point pTwo = new Point(2, 3);
		Point pThree = new Point(4, 5);
		Point pFour = new Point(10, 10);
		Point pFive = new Point(10, 30);
		Point pSix = new Point(30, 30);
		Point pSeven = new Point(30, 10);
		Point pEight = new Point(-10, -10);
		Point pNine = new Point(-10, -30);
		Point pTen = new Point(-40, -30);
		Point pEleven = new Point(-40, -10);

		Triangle trOne = new Triangle(pOne, pTwo, pThree);
		Square sqOne = new Square(pFour, pFive, pSix, pSeven);
		Rectangle rqOne = new Rectangle(pEight, pNine, pTen, pEleven);
		Rectangle rqTwo = new Rectangle(pEight, pNine, pTen, pEleven);

		
		Table tb = new Table();
		tb.checkAndPutShape(rqOne);
		tb.deleteShape(rqOne);
		tb.checkAndPutShape(rqTwo);
		tb.checkAndPutShape(trOne);
		tb.deleteShape(trOne);
		tb.checkAndPutShape(sqOne);
		tb.show();
	}

}
