package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(3, 1, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(3, 1, 5);
        assertThat(result, is(5));
    }
}