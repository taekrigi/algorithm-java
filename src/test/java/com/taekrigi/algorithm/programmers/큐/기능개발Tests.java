package com.taekrigi.algorithm.programmers.큐;

import com.taekrigi.algorithm.programmers.스택.같은숫자는싫어;
import com.taekrigi.algorithm.programmers.큐.기능개발;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class 기능개발Tests {

    private static final 기능개발 functionDevelopment = new 기능개발();

    @Test
    public void case1() {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] output = {2, 1};

        int[] result = functionDevelopment.solution(progresses, speeds);

        assertArrayEquals(result, output);
    }

    @Test
    public void case2() {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        int[] output = {1, 3, 2};

        int[] result = functionDevelopment.solution(progresses, speeds);

        assertArrayEquals(result, output);
    }
}
