package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEuro = 2;
        float expectedUsd = (float) 140 / 60;
        float outEuro = Converter.rubleToEuro(in);
        float outUsd = Converter.rubleToEuro(in);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedUsd = expectedUsd == outUsd;
        System.out.println("140 rubles are 2 Euro. Test result : " + passedEuro);
        System.out.println("140 rubles are 2,3333 USD. Test result : " + passedUsd);
    }
}