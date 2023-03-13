package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder str = new StringBuilder(s);
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                buf.append(str.charAt(i));
            }
        }
        s = buf.toString();
        return s;
    }
}
