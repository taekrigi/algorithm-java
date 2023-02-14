package com.taekrigi.algorithm.leetcode.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Maximum69NumberTests {

    private static final Maximum69Number maximum69Number = new Maximum69Number();

    @Test
    public void case1() {
        int num = 9669;
        int output = 9969;

        int max = maximum69Number.maximum69Number(num);

        assertEquals(max, output);
    }

    @Test
    public void case2() {
        int num = 9996;
        int output = 9999;

        int max = maximum69Number.maximum69Number(num);

        assertEquals(max, output);
    }

    @Test
    public void case3() {
        int num = 9999;
        int output = 9999;

        int max = maximum69Number.maximum69Number(num);

        assertEquals(max, output);
    }
}
