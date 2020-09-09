package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void wnenArrayHasNot9ThenMinus1() {
        int[] input = {1, 2, 3};
        int value = 9;
        int result = FindLoop.indexOf(input, value);
        int expected = -1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind() {
        int[] input = new int[]{5, 2, 10, 2, 4};
        int value = 5;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}