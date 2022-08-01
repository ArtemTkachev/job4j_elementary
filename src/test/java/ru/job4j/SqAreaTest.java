package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void whenP8K4Square2dot56() {
        double expected = 2.56;
        int p = 8;
        double k = 4;
        double out = SqArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void whenP3K1Square0dot56() {
        double expected = 0.56;
        int p = 3;
        double k = 1;
        double out = SqArea.square(p, k);
        assertThat(out).isCloseTo(expected, offset(0.01));
    }
}