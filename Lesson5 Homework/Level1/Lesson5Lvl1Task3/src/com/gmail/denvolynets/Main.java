package com.gmail.denvolynets;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector = new int[15];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * 100);
		}
		int[] newVector = Arrays.copyOf(vector,2 * vector.length);
		for (int i = vector.length; i < newVector.length; i++) {
			newVector[i] = vector[i - vector.length] * 2;
		}
		for (int i = 0; i < newVector.length; i++) {
			System.out.println(newVector[i]);
		}
	}

}
