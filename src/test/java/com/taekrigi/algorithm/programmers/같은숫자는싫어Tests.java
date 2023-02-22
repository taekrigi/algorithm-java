package com.taekrigi.algorithm.programmers;

import com.taekrigi.algorithm.programmers.스택.같은숫자는싫어;
import com.taekrigi.algorithm.programmers.해시.완주하지못한선수;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class 같은숫자는싫어Tests {

    private static final 같은숫자는싫어 hateSameNumber = new 같은숫자는싫어();

    @Test
    public void case1() {
       int[] input = {1, 1, 3, 3, 0, 1, 1};
       int[] output = {1, 3, 0, 1};

       int[] result = hateSameNumber.solution(input);

       assertArrayEquals(result, output);
    }

    @Test
    public void case2() {
        int[] input = {4, 4, 4, 3, 3};
        int[] output = {4, 3};

        int[] result = hateSameNumber.solution(input);

        assertArrayEquals(result, output);
    }
}
