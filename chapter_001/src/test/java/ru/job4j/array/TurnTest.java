package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void turn() {
        Turn turner = new Turn();
        int[] input = new int[] {1,2,3,4,5};
        int[] result = turner.turn(input);
        int[] expect = new int[] {1,2,3,4,5};
        assertThat(result, is(expect));

    }

    @Test
    public void back() {
        Turn turner = new Turn();
        int[] input = new int[] {1,2,3,4,5};
        int[] result = turner.back(input);
        int[] expect = new int[] {5,4,3,2,1};
        assertThat(result, is(expect));
    }

    @Test
    public void evenNumber() {
        Turn turner = new Turn();
        int[] input = new int[] {1,2,3,4};
        assertTrue(input.length % 2 == 0);
    }

    @Test
    public void oddNumber() {
        Turn turner = new Turn();
        int[] input = new int[] {1,2,3,4,5};
        assertFalse(input.length % 2 == 0);
    }
}