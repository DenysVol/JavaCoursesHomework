package com.gmail.denvolynets;

public class WrongInformationException extends Exception {

	private static final long serialVersionUID = 5117206003996806797L;

	@Override
	public String getMessage(){
		return "Inputed data is wrong. Student isn't added to group.";
		
	}
}
