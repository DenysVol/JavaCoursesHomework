package com.gmail.denvolynets216;

import java.util.Comparator;

public class SomeClass <T> {
    private T field;
    public SomeClass(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "field=" + field +
                '}';
    }

    public static <V extends Comparable<V>> V getMin(V[] array){
        V min = array[0];
        for (V element: array) {
            if (min.compareTo(element)> 0){
                min = element;
            }
        }
        return min;
    }


}
