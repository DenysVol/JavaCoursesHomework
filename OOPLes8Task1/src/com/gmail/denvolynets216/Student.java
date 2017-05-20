package com.gmail.denvolynets216;

import java.io.Serializable;

public class Student implements Serializable{

private static final long serialVersionUID = 1L;

    private String surname;
    private String name;
    private int age;
    private double averagePoint;

    public Student(String surname, String name, int age, double averagePoint) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.averagePoint = averagePoint;
    }

    public Student() {
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

    public double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(double averagePoint) {
        this.averagePoint = averagePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", averagePoint=" + averagePoint +
                '}';
    }


}
