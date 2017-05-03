package com.gmail.denvolynets;

public class Network {

	private Phone[] phoneArr = new Phone[0];
	
	public Network() {
		super();
	}
	
	public int getPhoneIntoArray(Phone phone){
		for (int i = 0; i < phoneArr.length; i++) {
			if(phoneArr[i].getNumber() == phone.getNumber()){
				return i;
			}
		}
		return -1;
	}
	
	public void addPhone(Phone phone){
		if(getPhoneIntoArray(phone) != -1){
			System.out.println("Number already registered");
			return;
		}else{
			Phone temp[] = new Phone[phoneArr.length + 1];
			System.arraycopy(phoneArr, 0, temp, 0, phoneArr.length);
			temp[temp.length - 1] = phone;
			phoneArr = temp;
		}
	}
	
	public Phone getPhoneByNumber(String phoneNumber) {
		for (Phone phone : phoneArr) {
			if (phone.getNumber() == phoneNumber) {
				return phone;
			}
		}
		return null;
	}
	
}
