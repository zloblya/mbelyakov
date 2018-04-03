package ru.job4j.array;

public class FindAWord {
    //private char[] date;

    public boolean checkingForAWordInAnotherWord(String line, String prefix) {
        char[] date = line.toCharArray();
        //this.date = line.toCharArray();
        char[] sub = prefix.toCharArray();
        boolean result = false;
        for (int i = 0; i < date.length; i++) {
            if (sub[0] == date[i]) {
                for (int j = 0; j < sub.length; j++) {
                    if (sub[j] == date[i + j]) {
                        result = true;
                    }
                    else {
                        result = false;
                    }
                }
            }
        }
        return result;
    }
}