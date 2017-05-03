package com.gmail.denvolynets;

public class Human {
	private String name;
	private String surname;
	private int age;
	private boolean sex;
	private String nationality;

	public void getInfo() {
		System.out.println( "Human [surname=" + surname + ", name=" + surname + ", age=" + age + ", sex=" + ((sex == true) ? "male" : "female")
				+ ", nationality=" + nationality + "]");
	}

	public Human() {
		super();
	}
	
	public Human(String surname, String name, int age, boolean sex, String nationality) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.sex = sex;
		this.nationality = nationality;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
}
