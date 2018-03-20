package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void calculateForArray() {
        Square square = new Square();
        int[] array = square.calculateForArray(3);
        int[] expected = new int[] {0, 1, 4};
        assertThat(array, is(expected));

    }
}