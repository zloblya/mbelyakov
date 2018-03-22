package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void indexOf() {
        FindLoop findLoop = new FindLoop();
        int result = findLoop.indexOf(new int[] {0, 4, 10, 15, 20}, 15);
        int expected = 3;
        assertThat(result, is(expected));
    }
}