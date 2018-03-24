package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void sort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] input = new int[] {1,8,16,3,6};
        int[] result = bubbleSort.sort(input);
        int[] expected = new int[] {1,3,6,8,16};
        assertThat(result, is(expected));
    }
}