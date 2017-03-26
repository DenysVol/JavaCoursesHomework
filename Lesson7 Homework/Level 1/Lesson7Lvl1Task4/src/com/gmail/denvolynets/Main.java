package com.gmail.denvolynets;

import java.util.Formatter;

public class Main {
	public static void main(String[] args) {
		String f = "";
		for (int i = 2; i < 11; i++) {
			Formatter form = new Formatter();
			f = "%." + i + "f";
			form.format(f, Math.PI);
			String text = form.toString();
			System.out.println(text);
			form.close();
		}
	}
}
