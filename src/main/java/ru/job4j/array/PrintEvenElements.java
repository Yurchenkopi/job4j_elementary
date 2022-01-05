package ru.job4j.array;

public class PrintEvenElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        for (int i = 0; i < numbers.length; i++) {
            if ((numbers.length - i - 1) % 2 == 0) {
                System.out.println(
                        "Текущий элемент массива начиная с последнего \""
                                + numbers[numbers.length - 1 - i]  + "\" имеет индекс i = " + (numbers.length - 1 - i)
                );
            }
        }
    }
}
