package ru.job4j.array;

public class Turn {
    public int[] turn(int[] array) {
        for (int i = 0; i < array.length; i++) {
           int input = array[i];
        }
        return array;
    }

    public int[] back(int[] array) {
        int j = 0;
        for (int i = array.length; i > 0; i--) {
            array[j] = i;
            j++;
        }
        return array;
    }
}
