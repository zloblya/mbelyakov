package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayDublicateTest {

    @Test
    public void arrayDublicate() {
        ArrayDublicate arrayDublicate = new ArrayDublicate();
        String[] input = {"Лида", "Ирина", "Лида", "Лукерия", "Лукерия"};
        String[] exeption = {"Лида", "Ирина", "Лукерия"};
        String[] result = arrayDublicate.ArrayDublicate(input);
        assertThat(result, is(exeption));
    }

    @Test
    public void arrayDublicateOfNumber() {
        ArrayDublicate arrayDublicate = new ArrayDublicate();
        String[] input = {"1", "1", "2", "2", "3"};
        String[] exeption = {"1", "3", "2"};
        String[] result = arrayDublicate.ArrayDublicate(input);
        assertThat(result, is(exeption));
    }
}