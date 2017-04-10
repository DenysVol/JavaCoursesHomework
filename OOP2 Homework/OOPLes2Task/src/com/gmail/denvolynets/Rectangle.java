package com.gmail.denvolynets;

public class Rectangle extends Shape{
	
	private Point pOne = new Point();
	private Point pTwo = new Point();
	private Point pThree = new Point();
	private Point pFour = new Point();
		
	public Rectangle(Point pOne, Point pTwo, Point pThree, Point pFour) {
		super();
		this.pOne = pOne;
		this.pTwo = pTwo;
		this.pThree = pThree;
		this.pFour = pFour;
		this.point[0] = pOne;
		this.point[1] = pTwo;
		this.point[2] = pThree;
		this.point[3] = pFour;
	}

	public Point getpOne() {
		return pOne;
	}

	public void setpOne(Point pOne) {
		this.pOne = pOne;
	}

	public Point getpTwo() {
		return pTwo;
	}

	public void setpTwo(Point pTwo) {
		this.pTwo = pTwo;
	}

	public Point getpThree() {
		return pThree;
	}

	public void setpThree(Point pThree) {
		this.pThree = pThree;
	}

	public Point getpFour() {
		return pFour;
	}

	public void setpFour(Point pFour) {
		this.pFour = pFour;
	}

	@Override
	double getPerimetr() {
		double p = 0;
		if (makeSide(pOne, pTwo) != makeSide(pThree, pFour) 
				|| makeSide(pTwo, pThree) != makeSide(pFour, pOne)
				|| makeSide(pTwo, pFour) != makeSide(pOne, pThree)) {
			p = -1;
		} else {
			p = makeSide(pOne, pTwo) + makeSide(pTwo, pThree)+ makeSide(pThree, pFour) + makeSide(pFour, pOne);
		}
		return p;
	}

	@Override
	double getArea() {
		double s = 0;
		if (getPerimetr() < 0) {
			s = -1;
			System.out.println("Rectangle doesn't exists");
		} else {
			s = (getPerimetr() * makeSide(pOne, pTwo) - 2 * Math.pow(makeSide(pOne, pTwo), 2))/2;
		}
		return s;
	}

	@Override
	double makeSide(Point a, Point b) {
		double side = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
		if (side < 0) {
			side = -1;
			System.out.println("Rectangle doesn't exist");
		}
		return side;
	}
	@Override
	public String toString(){
		return "Rectangle";
	}

}
