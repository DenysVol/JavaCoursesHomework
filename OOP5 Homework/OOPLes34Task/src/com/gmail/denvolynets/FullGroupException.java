package com.gmail.denvolynets;

public class FullGroupException extends Exception {

	private static final long serialVersionUID = -272007728636277807L;

	@Override
	public String getMessage(){
		return "You tried to add more then 10 students";
	}
}
