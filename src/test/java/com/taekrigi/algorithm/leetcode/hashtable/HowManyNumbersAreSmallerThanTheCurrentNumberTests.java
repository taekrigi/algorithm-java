package com.taekrigi.algorithm.leetcode.hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HowManyNumbersAreSmallerThanTheCurrentNumberTests {

    private HowManyNumbersAreSmallerThanTheCurrentNumber howManyNumbersAreSmallerThanTheCurrentNumber
            = new HowManyNumbersAreSmallerThanTheCurrentNumber();

    @Test
    public void case1() {
        int[] input = {8, 1, 2, 2, 3};
        int[] output = {4, 0, 1, 1, 3};

        int[] result = howManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(input);

        assertArrayEquals(result, output);
    }

    @Test
    public void case2() {
        int[] input = {6, 5, 4, 8};
        int[] output = {2, 1, 0, 3};

        int[] result = howManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(input);

        assertArrayEquals(result, output);
    }

    @Test
    public void case3() {
        int[] input = {7, 7, 7, 7};
        int[] output = {0, 0, 0, 0};

        int[] result = howManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(input);

        assertArrayEquals(result, output);
    }
}
