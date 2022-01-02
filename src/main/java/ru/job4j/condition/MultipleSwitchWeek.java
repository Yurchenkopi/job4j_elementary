package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
            System.out.println("Понедельнику соответствует номер " + numberOfDay("Понедельник"));
            System.out.println("Вторнику соответствует номер " + numberOfDay("Вторник"));
            System.out.println("Среде соответствует номер " + numberOfDay("Wednesday"));
            System.out.println("Четвергу соответствует номер " + numberOfDay("Thursday"));
            System.out.println("Пятнице соответствует номер " + numberOfDay("Пятница"));
            System.out.println("Субботе соответствует номер " + numberOfDay("Суббота"));
            System.out.println("Воскресенью соответствует номер " + numberOfDay("Воскресенье"));
    }
}
