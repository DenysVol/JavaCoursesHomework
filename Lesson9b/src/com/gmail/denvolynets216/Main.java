package com.gmail.denvolynets216;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listOne = new ArrayList<>();
        listOne.add("Hello");
        listOne.add("world");

        System.out.println(listOne.size());

        System.out.println(listOne);

        listOne.add(1,"my");

        System.out.println(listOne);

        Iterator<String> itr = listOne.iterator();

        for (;itr.hasNext();){
            System.out.println(itr.toString());
        }

        listOne.set(1, "your");
        System.out.println(listOne);
    }
}
