package com.gmail.denvolynets;

import java.io.File;

public class Main {
	public static void main(String[] args){
		File a = new File("a.txt");
		File b = new File("b.txt");
		FileOperations.combiner(a, b);
	}
}
