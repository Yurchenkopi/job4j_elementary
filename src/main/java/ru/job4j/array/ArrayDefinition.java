package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[5];
        names[0] = "Маша";
        names[1] = "Вова";
        names[2] = "Ира";
        names[3] = "Серхио";
        names[4] = "Сара";
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println("В первом элементе массива содержится имя \"" + names[i] + "\"");
        }
    }
}
