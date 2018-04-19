package ru.job4j.array;

import java.util.Arrays;

public class TreeArrays {
    public int[] sortingArrays(int[] oneInput, int[] twoInput) {
        int[] array = new int[oneInput.length + twoInput.length];
        System.arraycopy(oneInput, 0, array, 0, oneInput.length);
        System.arraycopy(twoInput, 0, array, oneInput.length, twoInput.length);
        Arrays.sort(array);
        return array;
    }
}