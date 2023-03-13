package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String str = Integer.toString(i);
        int k;
        boolean notSym = false;
        for (k = 0; k < str.length() / 2; k++) {
            if ((str.charAt(k)) != (str.charAt(str.length() - k - 1))) {
                notSym = true;
            }
        }
        return !notSym;
    }
}
