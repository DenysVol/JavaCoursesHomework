package com.gmail.denvolynets216;

public class Main {
    public static void main(String[] args) {
        SomeClass<String> a = new SomeClass<>("Hello world");
        System.out.println(a);
        a.setField("123");

        SomeClass<Integer> b = new SomeClass<Integer>(100);
        int number = 4 + b.getField();
        System.out.println(number);

        Integer [] arrayOne = new Integer[]{0, -2, -5, 2, 13};
        Integer min = SomeClass.getMin(arrayOne);
        System.out.println(min);
        String [] arrayTwo = new String[]{"One", "Two", "A", "a"};
        String minTwo = SomeClass.getMin(arrayTwo);
        System.out.println(minTwo);
        print(b);

    }

    public static void print(SomeClass<?> a){
        System.out.println(a);
    }
}
