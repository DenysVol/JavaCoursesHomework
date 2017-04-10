package com.gmail.denvolynets;

public class Phone {

	private String number;
	private String brand;
	private String model;
	private Network network;

	public Phone(String number, String brand, String model) {
		super();
		this.number = number;
		this.brand = brand;
		this.model = model;
		

	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void register(Network net){
		this.network = net;
		this.network.addPhone(this);
	}

	public void call(String number) {
		Phone tempPhone = this.network.getPhoneByNumber(number);
		if (tempPhone != null) {
			tempPhone.incomingCall();
		} else {
			System.out.println("Abonent not aviable");
		}

	}
	
	public void incomingCall() {
		System.out.println(this+" Dzzz - Dzzz");
	}
	
	@Override
	public String toString() {
		return "[number: " + number + "|brand: "
				+ brand + "|model: " + "model]";
	}

}
