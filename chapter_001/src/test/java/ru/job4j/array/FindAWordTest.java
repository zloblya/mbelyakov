package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindAWordTest {

    @Test
    public void checkingForAWordInAnotherWord() {
        FindAWord findAWord = new FindAWord();
        boolean result = findAWord.checkingForAWordInAnotherWord("Привет", "иве");
        assertThat(result, is(true));
    }

    @Test
    public void checkingForAWordInAnotherWordFalse() {
        FindAWord findAWord = new FindAWord();
        boolean result = findAWord.checkingForAWordInAnotherWord("Привет", "ивеп");
        assertThat(result, is(false));
    }
}