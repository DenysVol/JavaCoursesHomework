package com.gmail.denvolynets;

import java.io.File;
import java.io.FileFilter;

public class MyFilter implements FileFilter {

	private String[] extentions;

	public MyFilter(String... extentions) {
		super();
		this.extentions = extentions;
	}

	public boolean check(String ext) {
		for (String stringExt : extentions) {
			if (stringExt.equals(ext)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean accept(File pathname) {
		int pointerIndex = pathname.getName().lastIndexOf(".");
		if (pointerIndex == -1) {
			return false;
		}
		String ext = pathname.getName().substring(pointerIndex + 1);
		return check(ext);
	}
}
