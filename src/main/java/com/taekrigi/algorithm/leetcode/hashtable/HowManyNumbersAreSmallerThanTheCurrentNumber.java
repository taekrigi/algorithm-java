package com.taekrigi.algorithm.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/">leetcode</a>
 * @see <a href="https://en.wikipedia.org/wiki/Counting_sort">wikipedia</a>
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int size = nums.length;

        int[] output = new int[size];

        for (int i = 0; i < size; i++) {
            int num = nums[i];
            Integer cachedCount = counts.get(num);
            if (cachedCount != null) {
                output[i] = cachedCount;
                continue;
            }
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (num > nums[j]) {
                    count++;
                }
            }
            output[i] = count;
            counts.put(num, count);
        }

        return output;
    }
}
