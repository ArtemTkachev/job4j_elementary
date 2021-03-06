package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void when222to111then1p73() {
        double rsl = new Point(2, 2, 2).distance3D(new Point(1, 1, 1));
        assertThat(rsl, closeTo(1.73, 0.01));
    }

    @Test
    public void when000to200then2() {
        double rsl = new Point(0, 0, 0).distance3D(new Point(2, 0, 0));
        assertThat(rsl, closeTo(2, 0.01));
    }

    @Test
    public void when00to20then2P() {
        double rsl = new Point(0, 0).distance(new Point(2, 0));
        assertThat(rsl, closeTo(2, 0.01));
    }

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when63to68then5() {
        int x1 = 6;
        int y1 = 3;
        int x2 = 6;
        int y2 = 8;
        int expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to23then1p41() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 2;
        int y2 = 3;
        double expected = 1.41;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}