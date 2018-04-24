package ru.job4j.array;

public class TreeArrays {
    public int[] sortingArrays(int[] oneInput, int[] twoInput) {
        int[] three = new int[oneInput.length + twoInput.length];
        int i = 0, j = 0, index = 0;
        while (i < oneInput.length && j < twoInput.length) {
            three[index++] = oneInput[i] < twoInput[j] ? oneInput[i++] :  twoInput[j++];
        }
        if (i < oneInput.length) {
            System.arraycopy(oneInput, i, three, index, (oneInput.length - i));
        }
        if (j < twoInput.length) {
            System.arraycopy(twoInput, j, three, index, (twoInput.length - j));
        }
        return three;
    }
}