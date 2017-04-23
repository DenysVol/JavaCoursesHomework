package com.gmail.denvolynets;

public class WrongParamException extends Exception {

	private static final long serialVersionUID = 5840028520218999484L;

	@Override
	public String getMessage(){
		System.out.println();
		return "Wrong parametr for sort";
	}
}
