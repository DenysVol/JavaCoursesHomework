package com.gmail.denvolynets216;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Groups groups = new Groups();
        Group groupOne = new Group();
        Group groupTwo = new Group();
        groupOne.addStudent("Volynets", "Denys", 21, 4.2);
        groupOne.addStudent("Antoshkin", "Ruslan", 21, 4.5);
        groupOne.addStudent("Shapran", "Karina", 22, 5.0);
        groupTwo.addStudent("Pytaichuk", "Bogdan", 21, 4.3);
        groupTwo.addStudent("Gusak", "Eugene", 20, 4.4);
        groups.addGroup(groupOne);
        groups.addGroup(groupTwo);

        Scanner sc = new Scanner(System.in);
        int text = 3;
        for (;text != 0;) {
            System.out.println("What do you want to do with database?");
            System.out.println("1 - Write into file");
            System.out.println("2 - Read from file");
            System.out.println("0 - exit");
            text = sc.nextInt();
            Groups groupsFromFile = null;
            if(text == 1) {
                try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("database.dat"))) {
                    ous.writeObject(groups);
                    System.out.println("Groups saved into file");
                } catch (IOException e) {
                    System.out.println("Error saving groups");
                }
            }else if(text == 2) {
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("database.dat"))) {
                    groupsFromFile = (Groups) ois.readObject();
                    System.out.println("Groups loaded from file");
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Error loading groups");
                }
                groupsFromFile.printGroups();
            }

        }

    }

}
