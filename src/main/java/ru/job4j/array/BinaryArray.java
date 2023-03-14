package ru.job4j.array;

public class BinaryArray {

    private int[] data;

    public BinaryArray(int[] data) {
        this.data = data;
    }

    public int maxSeq() {
        int rsl = 0;
        int count = 0;
        if (data.length == 0) {
            rsl = -1;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] != 0) {
                count++;
                rsl = count > rsl ? count : rsl;
            } else {
                count = 0;
            }
        }
        return rsl;
    }
}
