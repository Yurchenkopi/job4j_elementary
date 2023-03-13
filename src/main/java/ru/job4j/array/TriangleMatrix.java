package ru.job4j.array;

import java.util.Arrays;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] rsl = new int[count][];
        int k = 1;
        for (int i = 0; i < count; i++) {
            rsl[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                rsl[i][j] = k;
                k++;
            }
        }
        return rsl;
    }
}
