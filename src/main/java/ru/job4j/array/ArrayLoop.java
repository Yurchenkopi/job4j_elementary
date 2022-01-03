package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arrayNums = new int[5];
        for (int index = 0; index < arrayNums.length; index++) {
            arrayNums[index] = index * 2 + 3;
        }
        for (int index = 0; index < arrayNums.length; index++) {
            System.out.println("Первый элемент массива: " + arrayNums[index]);
        }
    }
}
