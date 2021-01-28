package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void testMax1() {
        int result = Max.max(10, 5);
        assertThat(result, is(10));
    }

    @Test
    public void testMax2() {
        int result = Max.max(5, 9);
        assertThat(result, is(9));
    }

    @Test
    public void testMax3() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }
}