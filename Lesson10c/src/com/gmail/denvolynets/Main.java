package com.gmail.denvolynets;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {


        Cat catOne = new Cat("Murzik", "5", 3.8);
        Cat catTwo = new Cat("Mirza", "4", 5.6);
        Cat catThree = new Cat("Vaska", "2", 7.2);
        Cat catFour = new Cat("Umka", "1", 2.1);
        Cat catFive = new Cat("Kuzia", "3", 4.3);

        List<Cat> catList = new ArrayList<>();
        catList.add(catOne);
        catList.add(catTwo);
        catList.add(catThree);
        catList.add(catFour);
        catList.add(catFive);

        printCat(catList);
        System.out.println();
        ArrayList<Cat> streamList = catList.stream()
                .filter(n -> n.getWeight()>= 6)
                .collect(Collectors.toCollection(ArrayList::new));
        printCat(streamList);
        System.out.println();
        List<String> nameList = catList.stream()
                .filter((n) -> Integer.parseInt(n.getAge())>= 3)
                .map(n -> n.getName())
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(nameList);
    }

    public static void printCat(List<Cat> catList){
        for(Cat cat: catList){
            System.out.println(cat);
        }
    }
}
