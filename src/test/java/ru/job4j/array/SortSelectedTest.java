package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3numbs() {
        int[] data = new int[] {30, 54, 21};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {21, 30, 54};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5numbs() {
        int[] data = new int[] {33, 64, 31, 42, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 31, 33, 42, 64};
        Assert.assertArrayEquals(expected, result);
    }
}