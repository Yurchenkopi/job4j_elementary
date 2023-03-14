package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BinaryArrayTest {
    @Test
    void whenMultipleSeq() {
        BinaryArray binAr = new BinaryArray(
                new int[]{0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1}
        );

        int rsl = binAr.maxSeq();
        int expected = 5;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenOnlyZero() {
        BinaryArray binAr = new BinaryArray(
                new int[]{0, 0, 0, 0, 0}
        );

        int rsl = binAr.maxSeq();
        int expected = 0;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenOnlyOne() {
        BinaryArray binAr = new BinaryArray(
                new int[]{1, 1, 1, 1, 1, 1, 1}
        );

        int rsl = binAr.maxSeq();
        int expected = 7;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenEmptyArray() {
        BinaryArray binAr = new BinaryArray(
                new int[]{}
        );

        int rsl = binAr.maxSeq();
        int expected = -1;
        assertThat(rsl).isEqualTo(expected);
    }
}