package ru.job4j;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan185Then97dot75() {
        short in = 185;
        double expected = 97.75;
        double out = Fit.manWeight(in);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman185Then86dot25() {
        short in = 185;
        double expected = 86.25;
        double out = Fit.womanWeight(in);
        assertEquals(expected, out, 0.01);
    }
}