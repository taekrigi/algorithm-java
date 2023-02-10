package com.taekrigi.algorithm.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConcatenationOfArrayTests {

    private final ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();

    @Test
    public void case1() {
        int[] input = new int[] {1, 2, 1};
        int[] output = new int[] {1, 2, 1, 1, 2, 1};

        int[] concatenation = concatenationOfArray.getConcatenation(input);

        assertArrayEquals(concatenation, output);
    }

    @Test
    public void case2() {
        int[] input = new int[] {1, 3, 2, 1};
        int[] output = new int[] {1, 3, 2, 1, 1, 3, 2, 1};

        int[] concatenation = concatenationOfArray.getConcatenation(input);

        assertArrayEquals(concatenation, output);
    }
}
