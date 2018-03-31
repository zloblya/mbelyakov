package ru.job4j.array;

import java.util.Arrays;

public class ArrayDublicate {

    public String[] ArrayDublicate(String[] array) {
        int uniqu = array.length;
        for (int out = 0; out < uniqu; out++) {
            for (int in = out + 1; in < uniqu; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[uniqu - 1];
                    uniqu--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, uniqu);
    }
}
