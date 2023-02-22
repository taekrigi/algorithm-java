package com.taekrigi.algorithm.programmers.스택;

import java.util.Stack;

/**
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12906">programmers</a>
 */
public class 같은숫자는싫어 {

    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (!stack.isEmpty() && stack.peek() == arr[i]) {
                continue;
            }
            stack.add(arr[i]);
        }

        int[] array = new int[stack.size()];

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = stack.pop();
        }

        return array;
    }
}
