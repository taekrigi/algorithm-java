package com.taekrigi.algorithm.programmers.연습문제.레벨0;

/**
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/120924">programmers</a>
 */
public class 다음에올숫자 {

    public int solution(int[] common) {
        int firstDiff = common[1] - common[0];
        int secondDiff = common[2] - common[1];

        if (firstDiff == secondDiff) {
            return common[common.length - 1] + firstDiff;
        }

        return common[common.length - 1] * secondDiff / firstDiff;
    }
}
