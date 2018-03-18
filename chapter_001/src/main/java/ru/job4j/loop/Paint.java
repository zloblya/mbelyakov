package ru.job4j.loop;

import java.util.function.BiPredicate;

public class Paint {
    public String rightTriangle(int height) {
        return this.loopBy(height, height, (row, column) -> row >= column);
    }

    public String leftTriangle(int height) {
        return this.loopBy(height, height, (row, column) -> row >= height - column - 1);
    }

    public String allTriangle(int height) {
        return this.loopBy(height, 2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column);
    }

    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predicate) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predicate.test(row, column)) {
                    stringBuilder.append("^");
                }
                else {
                    stringBuilder.append(" ");
                }
            }
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}