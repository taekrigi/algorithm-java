package com.taekrigi.algorithm.programmers.연습문제.레벨0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 다음에올숫자Tests {

    private static final 다음에올숫자 nextNumber = new 다음에올숫자();

    @Test
    public void case1() {
        int[] common = {1, 2, 3, 4};
        int result = 5;

        int output = nextNumber.solution(common);

        assertEquals(output, result);
    }

    @Test
    public void case2() {
        int[] common = {2, 4, 8};
        int result = 16;

        int output = nextNumber.solution(common);

        assertEquals(output, result);
    }
}
