package com.gmail.denvolynets;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		boolean flag = false;

		for (int i = 2; i <= num; i++) {
			flag = false;
			if (i == 2) {
				flag = true;
				System.out.println(2);
			} else if (i % 2 == 0) {
				flag = false;
			} else {
				for (int j = 2; j <= i - 1; j++) {
					flag = false;
					if (i % j != 0) {
						flag = true;
					}else{
						flag = false;
						break;
					}
				}
				if (flag == true) {
					System.out.println(i);
				}
			}
		}
	}

}
