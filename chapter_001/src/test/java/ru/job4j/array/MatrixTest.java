package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void tableOfMultiple() {
        Matrix matrix = new Matrix();
        int[][] result = matrix.tableOfMultiple(3);
        int[][] expected = new int[][] {{0,0,0},
                                        {0,1,2},
                                        {0,2,4}};
        assertThat(result, is(expected));
    }
}