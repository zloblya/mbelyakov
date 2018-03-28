package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void startWith() {
        ArrayChar word = new ArrayChar("Привет дядя Василий");
        boolean result = word.startWith("Привет дядя");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("Привет тетя Нюра");
        boolean result = word.startWith("Привет детя Нюра");
        assertThat(result, is(false));
    }
}