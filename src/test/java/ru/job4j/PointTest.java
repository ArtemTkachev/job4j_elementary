package ru.job4j;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to23then2dot83() {
        double expected = 2.83;
        Point a = new Point(0, 1);
        Point b = new Point(2, 3);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21to44then3dot61() {
        double expected = 3.61;
        Point a = new Point(2, 1);
        Point b = new Point(4, 4);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }
}