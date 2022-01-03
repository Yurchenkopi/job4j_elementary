package ru.job4j.loop;

import org.junit.Test;

import org.junit.Assert;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int f = 5;
        int result = Factorial.calc(f);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int f = 0;
        int result = Factorial.calc(f);
        int expected = 1;
        Assert.assertEquals(expected, result);    }
}