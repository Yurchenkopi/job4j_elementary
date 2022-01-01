package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-5);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Input number is " + number + ": could not div by 0.");
        }
        if (number < 0) {
            System.out.println("Input number is " + number + ": this is negative number.");
        }
    }
}
