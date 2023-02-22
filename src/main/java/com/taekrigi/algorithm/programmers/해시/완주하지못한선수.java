package com.taekrigi.algorithm.programmers.해시;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42576">programmers</a>
 */
public class 완주하지못한선수 {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }

        return null;
    }
}
