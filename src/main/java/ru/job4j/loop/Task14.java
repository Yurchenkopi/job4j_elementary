package ru.job4j.loop;

import java.util.StringJoiner;

public class Task14 {
    public static void loop(int a, int b) {
        StringJoiner s = new StringJoiner(" ");
        System.out.println("Старт");
        for (int i = a; i < b; i++) {
            if (i >= 10 && i <= 99) {
                s.add(Integer.toString(i));
            }
        }
        System.out.println(s);
        System.out.println("Финиш");
    }
}