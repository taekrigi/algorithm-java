package com.taekrigi.algorithm.leetcode.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbersTests {

    private static final PartitioningIntoMinimumNumberOfDeciBinaryNumbers partitioningIntoMinimumNumberOfDeciBinaryNumbers
            = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();

    @Test
    public void case1() {
        String n = "32";
        int output = 3;

        int result = partitioningIntoMinimumNumberOfDeciBinaryNumbers.minPartitions(n);

        assertEquals(result, output);
    }

    @Test
    public void case2() {
        String n = "82734";
        int output = 8;

        int result = partitioningIntoMinimumNumberOfDeciBinaryNumbers.minPartitions(n);

        assertEquals(result, output);
    }

    @Test
    public void case3() {
        String n = "27346209830709182346";
        int output = 9;

        int result = partitioningIntoMinimumNumberOfDeciBinaryNumbers.minPartitions(n);

        assertEquals(result, output);
    }
}
