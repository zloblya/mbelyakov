package ru.job4j.array;

public class TreeArrays {
    public int[] sortingArrays(int[] oneInput, int[] twoInput) {
        int[] array = new int[oneInput.length + twoInput.length];
        int result;
        int arrayOne;
        int arrayTwo;
        for (result = arrayOne = arrayTwo = 0; result < array.length; result++) {
            if (arrayOne < oneInput.length)
                if (arrayTwo < twoInput.length)
                    if (oneInput[arrayOne] < twoInput[arrayTwo])
                        array[result] = oneInput[arrayOne++];
                    else
                        array[result] = twoInput[arrayTwo++];
                else
                    array[result] = oneInput[arrayOne++];
            else
                array[result] = twoInput[arrayTwo];
        }
        return array;
    }
}
