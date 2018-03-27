package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void startWith() {
        ArrayChar word = new ArrayChar("Привет");
        boolean result = word.startWith("При");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("Превет");
        boolean result = word.startWith("Пре");
        assertThat(result, is(false));
    }
}