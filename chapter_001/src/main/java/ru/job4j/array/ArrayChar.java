package ru.job4j.array;

public class ArrayChar {
    private char[] date;
    public ArrayChar(String line) {
        this.date = line.toCharArray();
    }
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < prefix.length(); i++) {
            if (date[i] != value[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
