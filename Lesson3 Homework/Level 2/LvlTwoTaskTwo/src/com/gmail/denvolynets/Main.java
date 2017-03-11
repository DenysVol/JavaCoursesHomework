package com.gmail.denvolynets;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 0;
		int a2 = 0;
		int b1 = 4;
		int b2 = 4;
		int c1 = 6;
		int c2 = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the point: ");
		System.out.print("x = ");
		int x = sc.nextInt();
		System.out.print("y = ");
		int y = sc.nextInt();
		
		double ab = Math.sqrt(Math.pow(b1 - a1, 2) + Math.pow(b2 - a2, 2));
		double bc = Math.sqrt(Math.pow(c1 - b1, 2) + Math.pow(c2 - b2, 2));
		double ac = Math.sqrt(Math.pow(c1 - a1, 2) + Math.pow(c2 - a2, 2));
		double ax = Math.sqrt(Math.pow(x - a1, 2) + Math.pow(y - a2, 2));
		double bx = Math.sqrt(Math.pow(x - b1, 2) + Math.pow(y - b2, 2));
		double cx = Math.sqrt(Math.pow(x - c1, 2) + Math.pow(y - c2, 2));
		
		double pAbc = (ab + bc + ac) / 2;
		double pAbx = (ab + ax + bx) / 2;
		double pBcx = (bc + bx + cx) / 2;
		double pAcx = (ac + ax + cx) / 2;
		
		double sAbc = Math.sqrt(pAbc * (pAbc - ab) * (pAbc - bc) * (pAbc - ac));
		double sAbx = Math.sqrt(pAbx * (pAbx - ab) * (pAbx - ax) * (pAbx - bx));
		double sBcx = Math.sqrt(pBcx * (pBcx - bc) * (pBcx - bx) * (pBcx - cx));
		double sAcx = Math.sqrt(pAcx * (pAcx - ac) * (pAcx - ax) * (pAcx - cx));
		
		if (sAbc == sAbx + sBcx + sAcx){
			System.out.println("The point is inside the triangle");
		}else{
			System.out.println("The point is outside the triangle");
		}
		sc.close();
	}

}
