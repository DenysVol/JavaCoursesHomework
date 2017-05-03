package com.gmail.denvolynets;

public class Main {

	public static void main(String[] args) {
		int num = 9945;
		int left = num / 100;
		int right = num % 100;
		if ((left / 10 + left % 10) / 10 == 1){ 
			left = (left / 10 + left % 10) / 10 + (left / 10 + left % 10) % 10;
		}
		if ((right / 10 + right % 10) / 10 == 1){
			right = (right / 10 + right % 10) / 10 + (right / 10 + right % 10) % 10;
		}
		System.out.println("Your number is " + num);
		if (left / 10 + left % 10 == right / 10 + right % 10){
			System.out.println("Congratulations! You've got a lucky ticket.");
		}else{
			System.out.println("Oops! This is not lucky one.");
		}
	}

}
