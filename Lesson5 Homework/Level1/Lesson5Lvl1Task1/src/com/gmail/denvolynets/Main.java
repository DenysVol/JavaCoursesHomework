package com.gmail.denvolynets;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 5, 2, 4, 7, 1, 3, 19};
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0){
				counter++;
			}
		}
		System.out.println(counter);
	}

}
