package com.taekrigi.algorithm.programmers.해시;

import com.taekrigi.algorithm.programmers.해시.폰켓몬;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 폰켓몬Tests {

    private static final 폰켓몬 phonekemon = new 폰켓몬();

    @Test
    public void case1() {
        int[] nums = {3, 1, 2, 3};
        int output = 2;

        int result = phonekemon.solution(nums);

        assertEquals(result, output);
    }

    @Test
    public void case2() {
        int[] nums = {3, 3, 3, 2, 2, 4};
        int output = 3;

        int result = phonekemon.solution(nums);

        assertEquals(result, output);
    }

    @Test
    public void case3() {
        int[] nums = {3, 3, 3, 2, 2, 2};
        int output = 2;

        int result = phonekemon.solution(nums);

        assertEquals(result, output);
    }
}
