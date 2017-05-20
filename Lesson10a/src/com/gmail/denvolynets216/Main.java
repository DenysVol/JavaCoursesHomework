package com.gmail.denvolynets216;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> number = new HashMap<>();
        number.put(1, "one");
        number.put(9, "nine");

        System.out.println(number.get(9));
        number.put(5, "five");
        System.out.println(number);
        System.out.println(number.get(8));
        number.put(1, "ONE");
        System.out.println(number);
        Set<Integer> keySet = number.keySet();
        for (Integer num: keySet
             ) {
            System.out.println(num+ " => " + number.get(num));
        }
        number.forEach((numb, text) -> System.out.println(numb + " => " + text));

    }
}
