package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void paint() {
        Board board = new Board();
        String string = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(string, is(String.format("X X%s X %sX X%s", ln, ln, ln)));
    }
}