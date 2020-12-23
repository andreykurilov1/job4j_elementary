package ru.job4j.converter;

import org.junit.Test;

import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert700RblThen10Euro() {
        int in = 700;
        int expected = 10;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 580;
        int expected = 9;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}