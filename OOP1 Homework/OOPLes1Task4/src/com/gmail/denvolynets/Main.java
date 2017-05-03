package com.gmail.denvolynets;

public class Main {

	public static void main(String[] args) {
		
		Network life = new Network();
		
		Phone phOne = new Phone("09312345678", "Meizu", "M2 Note");
		Phone phTwo = new Phone("06734345656", "Xiaomi", "Redmi 3");
		Phone phThree = new Phone("0996781254", "Google", "Nexus P");
		
		phOne.register(life);
		phTwo.register(life);
		phThree.register(life);
		phOne.call("06734345656");
		phThree.call("09312345678");
	}

}
