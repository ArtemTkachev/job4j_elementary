package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNLessZero() {
        new Fact().calc(-1);
    }

    @Test
    public void whenNNotLessZero() {
        assertThat(new Fact().calc(3), is(6));
    }
}