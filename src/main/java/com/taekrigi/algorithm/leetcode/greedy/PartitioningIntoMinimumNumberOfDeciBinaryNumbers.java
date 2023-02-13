package com.taekrigi.algorithm.leetcode.greedy;

/**
 * @see <a href="https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/">leetcode</a>
 */
public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    public int minPartitions(String n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            if (max < digit) {
                max = digit;
            }
        }
        return max;
    }
}
