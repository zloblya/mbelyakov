package ru.job4j.loop;


public class Paint {
    public String rightTriangle(int height) {
        StringBuilder stringBuilder = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= column) {
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

    public String leftTriangle(int height) {
        StringBuilder stringBuilder = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
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

    public String allTriangle(int height) {
        StringBuilder stringBuilder = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    stringBuilder.append("^");
                } else {
                    stringBuilder.append(" ");
                }
            }
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}