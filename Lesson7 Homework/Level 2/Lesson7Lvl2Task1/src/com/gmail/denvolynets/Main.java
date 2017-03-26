package com.gmail.denvolynets;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cl1 = Calendar.getInstance();
		Calendar cl2 = Calendar.getInstance();
		Date date1 = new Date();
		Date date2 = new Date();
		SimpleDateFormat sdfOne = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Input date: ");
		String text = sc.nextLine();

		try {
			date1 = sdfOne.parse(text);
		} catch (ParseException e) {
			System.out.println(e);
			System.exit(0);
		}
		cl1.setTime(date1);
		cl2.setTime(date2);
		if (!date1.equals(date2)) {
			System.out.println("Inputed and current dates differ by:");
			equal(cl1, cl2);
		} else {
			System.out.println("Inputed and current dates are the same");
		}
		sc.close();
	}

	static void equal(Calendar cl1, Calendar cl2) {
		if (cl1.get(Calendar.DAY_OF_MONTH) != cl2.get(Calendar.DAY_OF_MONTH)) {
			System.out.print("Day of month - ");
			System.out.println(cl1.get(Calendar.DAY_OF_MONTH));
		}
		if (cl1.get(Calendar.MONTH) != cl2.get(Calendar.MONTH)) {
			System.out.print("Month - ");
			System.out.println(cl1.get((Calendar.MONTH)) + 1);
		}
		if (cl1.get(Calendar.YEAR) != cl2.get(Calendar.YEAR)) {
			System.out.print("Year - ");
			System.out.println(cl1.get(Calendar.YEAR));
		}
	}
}
