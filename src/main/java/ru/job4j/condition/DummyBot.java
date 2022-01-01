package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        if ("Привет, Бот.".equals(question)) {
            return "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            return "До скорой встречи.";
        } else {
            return "Это ставит меня в тупик. Задайте другой вопрос.";
        }
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Куку.");
        System.out.println(rsl);
    }
}
