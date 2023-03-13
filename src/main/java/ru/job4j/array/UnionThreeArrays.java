package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int l = 2 + middle.length / 2 + middle.length / 2 + 1;
        int[] rsl = new int[l];
        rsl[0] = left[0];
        rsl[l - 1] = left[left.length - 1];
        for (int i = 1; i < l - 1; i++) {
            if (i % 2 != 0) {
                rsl[i] = right[i - 1];
            } else {
                rsl[i] = middle[i - 1];
            }
        }
        return rsl;
    }
}
