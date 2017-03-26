package com.gmail.denvolynets;

public class Main {

	public static void main(String[] args) {
		int n = 156;
		int m = 23;
		System.out.println("Inputed values are: "+ n + " and " + m);
		System.out.println("Hamming distance is " + findDistance(toBin(compare(n, m))));

	}

	static int toBin(int a) {
		int result = 0;
		int dozen = 1;

		while (a > 0) {
			int rest = a % 2;
			a = a / 2;
			result = result + rest * dozen;
			dozen = dozen * 10;
		}
		return result;
	}

	static int compare(int a, int b) {
		int result = 0;
		if(a > 0 & b > 0){
		result = a ^ b;
		}else{
			System.out.println("Wrong numbers");
			System.exit(0);
		}
		return result;
		
	}

	static int findDistance(int a) {
		int sum = 0;
		while (a != 0) {
			sum += a % 10;
			a /= 10;
		}
		return sum;
	}
}
