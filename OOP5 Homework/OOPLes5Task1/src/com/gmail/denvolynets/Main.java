package com.gmail.denvolynets;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		MyFilter filter = new MyFilter("doc", "pdf", "txt");
		File fIn = new File("a");
		File fOut = new File("b");
		try {
			File[] fl = fIn.listFiles(filter);
			for (File in : fl) {
				String path = fOut.getName() + "/" + in.getName();
				File out = new File(path);
				FileOperations.copyFiles(in, out);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
