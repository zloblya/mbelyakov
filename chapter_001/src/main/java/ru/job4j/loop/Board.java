package ru.job4j.loop;

public class Board {
    public String paint(int wedth, int height) {
        StringBuilder stringBuilder = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < wedth; j++) {
                if ((i + j) % 2 == 0) {
                    stringBuilder.append("X");
                }
                else {
                    stringBuilder.append(" ");
                }
            }
            stringBuilder.append(ln);
        }
        return stringBuilder.toString();
    }

}
