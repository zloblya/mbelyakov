package ru.job4j.array;

public class Square {
    public int[] calculateForArray(int bound) {
        int[] result = new int[bound];
        for (int i = 0; i < result.length; i++) {
           result[i] = i * i;
        }
        return result;
    }
}
