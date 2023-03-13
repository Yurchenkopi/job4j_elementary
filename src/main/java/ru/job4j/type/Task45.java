package ru.job4j.type;

public class Task45 {
    public static void leftNumChange(int number1, int number2) {
        System.out.println((number2 / 100) * 100 + number1 % 100);
        System.out.println((number1 / 100) * 100 + number2 % 100);
    }

    public static void main(String[] args) {
        leftNumChange(109, 704);
    }

}