package com.gmail.denvolynets;

public abstract class Shape {
	abstract double getPerimetr();
	abstract double getArea();
	abstract double makeSide(Point a,Point b);
	Point[] point = new Point[4]; 
}
