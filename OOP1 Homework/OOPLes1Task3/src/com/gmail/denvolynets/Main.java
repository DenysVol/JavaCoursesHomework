package com.gmail.denvolynets;

public class Main {

	public static void main(String[] args) {
		Vector3d v1 = new Vector3d("v1", 1, 2, 3);
		Vector3d v2 = new Vector3d("v2", 4, 5, 6);
		Vector3d v3 = new Vector3d("v3", -2, -5, 7);
		v1.sumVector(v2);
		v1.scalarMul(v2);
		v1.vectorMul(v2);
		v3.scalarMul(v2);
		v2.vectorMul(v3);
	}

}
