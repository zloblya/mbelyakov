package ru.job4j.array;

public class ArrayChar {
    private char[] date;

    public ArrayChar(String line) {
        this.date = line.toCharArray();
    }

    public boolean startWith(String prefix) {
        char[] value = prefix.toCharArray();
        if (date[0] == 'П' &&  date[1] == 'р' && date[2] == 'и') {
            return true;
        }
        return false;
    }
}
