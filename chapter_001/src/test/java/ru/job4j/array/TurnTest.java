package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void back() {
        Turn turner = new Turn();
        int[] input = new int[] {3,6,9,20,45,50};
        int[] resultArray = turner.back(input);
        int[] expectArray = new int[] {50,45,20,9,6,3};
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void evenNumber() {
        int[] input = new int[] {1,2,3,4};
        assertTrue(input.length % 2 == 0);
    }

    @Test
    public void oddNumber() {
        int[] input = new int[] {1,2,3,4,5};
        assertFalse(input.length % 2 == 0);
    }

}