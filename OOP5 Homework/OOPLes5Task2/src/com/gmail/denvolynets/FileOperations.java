package com.gmail.denvolynets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileOperations {

	public static void combiner(File a, File b) {
		if (a.isDirectory() || b.isDirectory()) {
			throw new IllegalArgumentException("File is Directory");
		}
		if (!a.getName().substring(a.getName().lastIndexOf(".") + 1).equals("txt")
				&& !b.getName().substring(b.getName().lastIndexOf(".") + 1).equals("txt")) {
			throw new IllegalArgumentException("It's not txt file");
		}
		try (BufferedReader brOne = new BufferedReader(new FileReader(a));
				BufferedReader brTwo = new BufferedReader(new FileReader(b));
				PrintWriter pw = new PrintWriter("c.txt")) {
			String strOne = "";
			String strTwo = "";
			String TextOne = "";
			String TextTwo = "";
			String[] textArrayOne;
			String[] textArrayTwo;
			for (; (strOne = brOne.readLine()) != null;) {
				TextOne += strOne.toLowerCase() + " ";
			}
			for (; (strTwo = brTwo.readLine()) != null;) {
				TextTwo += strTwo.toLowerCase() + " ";
			}
			textArrayOne = TextOne.split("\\. |\\, |\\!| |\\?|\\;|\\:|\\.|\\,");
			textArrayTwo = TextTwo.split("\\. |\\, |\\!| |\\?|\\;|\\:|\\.|\\,");
			for (String stringOne : textArrayOne) {
				for (String stringTwo : textArrayTwo) {
					if(stringOne.equals(stringTwo)){
						pw.println(stringOne);
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
