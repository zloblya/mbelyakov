package ru.job4j.array;

public class FindLoop {

    public int indexOf(int[] data, int el) {
        int result = -1;
        for (int index = 0; index < data.length; index++)  {
            if (el == data[index]) {
                result = index;
            }
        }
        return result;
    }
}
