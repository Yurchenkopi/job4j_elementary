package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double difDiv(double first, double second) {
        return sum(minus(first, second), div(first, second));
    }

    public static double total(double first, double second) {
        return sumAndMultiply(first, second) + difDiv(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sum+multiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета difDiv равен: " + difDiv(10, 20));
        System.out.println("Результат расчета total равен: " + total(10, 20));
    }
}
