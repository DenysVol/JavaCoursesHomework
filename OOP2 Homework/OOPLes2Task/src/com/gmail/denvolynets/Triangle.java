package com.gmail.denvolynets;

public class Triangle extends Shape {

	private Point pOne = new Point();
	private Point pTwo = new Point();
	private Point pThree = new Point();
	
	public Triangle(){
		
	}
	public Triangle(Point pOne, Point pTwo, Point pThree) {
		super();
		this.pOne = pOne;
		this.pTwo = pTwo;
		this.pThree = pThree;
		this.point[0] = pOne;
		this.point[1] = pTwo;
		this.point[2] = pThree;
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

	double makeSide(Point a, Point b) {
		double side = Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
		if (side < 0) {
			side = -1;
			System.out.println("Triangle doesn't exist");
		}
		return side;
	}

	@Override
	double getPerimetr() {
		double p = 0;
		if (makeSide(pOne, pTwo) < 0 || makeSide(pOne, pTwo) < 0 || makeSide(pTwo, pThree) < 0) {
			System.out.println("Triangle doesn't exist");
			p = -1;
		} else {
			p = (makeSide(pOne, pTwo) + makeSide(pOne, pThree) + makeSide(pTwo, pThree))/2;
		}
		return p;
	}

	@Override
	double getArea() {
		double s = 0;
		if (makeSide(pOne, pTwo) < 0 || makeSide(pOne, pTwo) < 0 || makeSide(pTwo, pThree) < 0) {
			s = -1;
		}else{
			s = Math.sqrt(getPerimetr()*
					(getPerimetr() - makeSide(pOne,pTwo))*
					(getPerimetr() - makeSide(pOne,pThree))*
					(getPerimetr() - makeSide(pTwo,pThree)));
		}
		return s;
	}
	@Override
	public String toString(){
		return "Triangle";
	}

}
