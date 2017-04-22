package com.gmail.denvolynets;

public class Student extends Human {

	private double averageGradePoint;

	public Student() {
		super();
	}

	public Student(String surname, String name, int age, boolean sex, String nationality, double averageGradePoint) {
		super(surname, name, age, sex, nationality);
		this.averageGradePoint = averageGradePoint;
	}

	public double getAverageGradePoint() {
		return averageGradePoint;
	}

	public void setAverageGradePoint(double averageGradePoint) {
		this.averageGradePoint = averageGradePoint;
	}

	@Override
	public void getInfo() {
		System.out.println("Student [surname=" + getSurname() + ", name=" + getName() + ", age=" + getAge() + ", sex="
				+ ((isSex() == true) ? "male" : "female") + ", nationality=" + getNationality() + ", averageGradePoint="
				+ getAverageGradePoint() + "]");
	}

	@Override
	public String toString() {
		return "Student [surname=" + getSurname() + ", name=" + getName() + ", age=" + getAge() + ", sex="
				+ ((isSex() == true) ? "male" : "female") + ", nationality=" + getNationality() + ", averageGradePoint="
				+ getAverageGradePoint() + "]";
	}

	
	
	
}