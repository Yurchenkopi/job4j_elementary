package ru.job4j.array;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        int i, j;
        for (i = 0; i < left.length; i++) {
            for (j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                System.out.println(right[j]);
                }
            }
        }

    }
}