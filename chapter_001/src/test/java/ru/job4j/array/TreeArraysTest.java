package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TreeArraysTest {

    @Test
    public void sortingArrays() {
        TreeArrays threeArrays = new TreeArrays();
        int[] result = threeArrays.sortingArrays(new int[]{1,3,13,27,50,7,60}, new int[]{2,4,5,90});
        int[] expected = new int[] {1,2,3,4,5,7,13,27,50,60,90};
        assertThat(result, is(expected));
    }
}