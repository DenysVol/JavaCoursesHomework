package com.gmail.denvolynets;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		Calendar clPast = Calendar.getInstance();
		Date date = cl.getTime();
		clPast.set(Calendar.MONTH, Calendar.MONTH - 1);
		Date date2 = clPast.getTime();
		System.out.println(date);
		System.out.println(date2);
		System.out.println("There are " + (date.getTime() - date2.getTime()) + " seconds between these monthes");
	}

}
