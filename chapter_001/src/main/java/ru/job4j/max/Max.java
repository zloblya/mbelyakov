package ru.job4j.max;

public class Max {

    public int maximumNumber(int first, int second) {
        return first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        int temp = this.maximumNumber(first, second);
        int maximum = this.maximumNumber(temp, third);
        return maximum;
    }
}
