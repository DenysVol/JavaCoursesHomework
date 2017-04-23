package com.gmail.denvolynets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperations {

	public static void copyFiles(File in, File out) throws IOException {
		if (in == null || out == null) {
			throw new IllegalArgumentException("Null file pointer");
		}
		if (!in.exists()) {
			throw new IllegalArgumentException("Source file doesn't exist");
		}
		if (in.isDirectory()) {
			throw new IllegalArgumentException("File is directory");
		}
		try (FileInputStream fis = new FileInputStream(in); FileOutputStream fos = new FileOutputStream(out)) {
			byte[] buffer = new byte[1024 * 1024];
			int byteCopied = 0;
			for (; (byteCopied = fis.read(buffer)) > 0;) {
				fos.write(buffer, 0, byteCopied);
			}
		} catch (IOException e) {
			throw e;
		}
	}

}
