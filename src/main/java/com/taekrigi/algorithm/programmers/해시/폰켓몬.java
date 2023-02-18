package com.taekrigi.algorithm.programmers.해시;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/1845">programmers</a>
 */
public class 폰켓몬 {

    public int solution(int[] nums) {
        int length = nums.length;
        int max = length / 2;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            set.add(nums[i]);
        }
        int setSize = set.size();

        return setSize < max ? setSize : max;
    }
}
