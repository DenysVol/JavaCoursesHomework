package com.gmail.denvolynets;

import java.util.Arrays;

public class Table {
	Shape[] shape = new Shape[4];
	Triangle tr = new Triangle();

	public void checkAndPutShape(Shape sh) {
		if (sh.getClass() == tr.getClass()) {
			sh.point = Arrays.copyOf(sh.point, 3);
			setShape(sh);
		} else {
			sh.point = Arrays.copyOf(sh.point, 4);
			setShape(sh);
		}
	}

	public void setShape(Shape sh) {
		int[] flag = new int[4];
		double[] x = new double[sh.point.length];
		double[] y = new double[sh.point.length];
		;
		for (int i = 0; i < sh.point.length; i++) {
			x[i] = sh.point[i].getX();
			y[i] = sh.point[i].getY();
		}
		for (int i = 0; i < sh.point.length; i++) {
			if (x[i] > 0 && y[i] > 0) {
				flag[0]++;
			}
			if (x[i] > 0 && y[i] < 0) {
				flag[1]++;
			}
			if (x[i] < 0 && y[i] < 0) {
				flag[2]++;
			}
			if (x[i] < 0 && y[i] > 0) {
				flag[3]++;
			}
		}
		for (int i = 0; i < flag.length; i++) {
			if (flag[i] == sh.point.length && shape[i] != null) {
				System.out.println("It's not empty");
				return;
			} else if (flag[i] == sh.point.length && shape[i] == null) {
				shape[i] = sh;
				System.out.println(sh.toString() + " puted");
				return;
			}
		}
	}

	public void deleteShape(Shape sh) {
		for (int i = 0; i < shape.length; i++) {
			if (shape[i] == sh) {
				shape[i] = null;
				System.out.println(sh.toString() + "Deleted");
				return;
			} else {
				System.out.println("There is no "+ sh.toString() +" in " + (i + 1) + " quad");
			}
		}
	}

	public void show() {
		double area = 0;
		System.out.println("Table");
		for (int i = 0; i < shape.length; i++) {
			if (shape[i] == null) {
				System.out.println((i + 1) + ") Empty");
			} else {
				System.out.println((i + 1) + ") " + shape[i].toString());
				area += shape[i].getArea();
			}
			
			
		}
		System.out.println("Area = " + area);
	}
}
