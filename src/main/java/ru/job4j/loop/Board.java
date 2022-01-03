package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        boolean black = true; //Начинаем вывод с черной клетки, т.е. с "X", если false - белая клетка, т.е. "  "
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                drawCell(black);
                black = !black;
            }
            if (width % 2 == 0) {
                black = !black;
            }
            System.out.println();
        }
    }

    public static void drawCell(boolean x) {
        if (x) {
            System.out.print("X");
        } else {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
