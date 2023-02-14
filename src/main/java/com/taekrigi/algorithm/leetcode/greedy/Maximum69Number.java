package com.taekrigi.algorithm.leetcode.greedy;

/**
 * @see <a href="https://leetcode.com/problems/maximum-69-number/">leetcode</a>
 */
public class Maximum69Number {

    public int maximum69Number(int num) {
        int result = 0;
        boolean changed = false;

        for (int i = 0; i < 4; i++) {
            int cal = (int) Math.pow(10, 3 - i);
            int n = num / cal;
            num %= cal;
            if (!changed && n == 6) {
                changed = true;
                result += 9 * cal;
            } else {
                result += n * cal;
            }
        }

        return result;
    }
}
