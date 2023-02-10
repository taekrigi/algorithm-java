package com.taekrigi.algorithm.leetcode.array;

/**
 * @see <a href="https://leetcode.com/problems/concatenation-of-array/">leetcode</a>
 */
public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int numSize = nums.length;
        int resultSize = numSize * 2;
        int[] result = new int[resultSize];
        for (int i = 0; i < resultSize; i++) {
            result[i] = nums[i % nums.length];
        }
        return result;
    }
}
