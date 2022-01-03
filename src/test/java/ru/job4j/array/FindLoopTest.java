package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class FindLoopTest {
    @Test
    public void whenArrayHas5ThenNO() {
        int[] data = {0, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas2Then3() {
        int[] data = {5, 4, 3, 2};
        int el = 2;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas7Then4() {
        int[] data = {5, 4, 3, 2, 7, 20};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
}