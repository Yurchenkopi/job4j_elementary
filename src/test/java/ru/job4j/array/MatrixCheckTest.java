package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixCheckTest {
    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenMonoHorizontalIs2ThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' '},
                {'X', 'X', 'X', 'X'},
        };
        int row = 2;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenMonoHorizontalIs1ThenFalse() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertFalse(result);
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertTrue(result);
    }
}