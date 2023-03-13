package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        boolean notEndOfLeft = true;
        boolean notEndOfRight = true;
        while (k < rsl.length) {
            if ((left.length > 0) && (left[i] <= right[j]) && (notEndOfLeft)) {
                rsl[k] = left[i];
                i++;
                if (i == left.length) {
                    notEndOfLeft = false;
                    i = left.length - 1;
                }
            } else if ((right.length > 0) && (notEndOfRight)) {
                rsl[k] = right[j];
                j++;
                if (j == right.length) {
                    notEndOfRight = false;
                    j = right.length - 1;
                }
            }
            k++;
        }
        return rsl;
    }
}
