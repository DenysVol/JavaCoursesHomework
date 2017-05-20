package com.gmail.denvolynets216;

import java.io.Serializable;
import java.util.Arrays;

public class Group implements Serializable{
    private Student[] group;
    private static final long serialVersionUID = 1L;

    public Group() {
        group = new Student[0];
    }

    public void addStudent(String surname, String name, int age, double averagePoint){
        Student[]  temp = new Student[group.length + 1];
        System.arraycopy(group,0, temp, 0, group.length);
        temp[temp.length-1] = new Student(surname, name, age, averagePoint);
        group = temp;
    }

    public void printGroup(){
        for (Student student : group) {
            System.out.println(student);
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                    Arrays.toString(group) +
                '}';
    }
}
