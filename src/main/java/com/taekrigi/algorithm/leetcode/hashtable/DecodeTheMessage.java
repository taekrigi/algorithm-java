package com.taekrigi.algorithm.leetcode.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/decode-the-message/">leetcode</a>
 */
public class DecodeTheMessage {

    public String decodeMessage(String key, String message) {
        Map<Character, Character> tables = new HashMap<>();
        tables.put(' ', ' ');

        int i = 0;
        for (char c : key.toCharArray()) {
            if (!tables.containsKey(c)) {
                tables.put(c, (char) ('a' + i));
                i++;
            }
        }

        StringBuilder output = new StringBuilder();
        for (char c : message.toCharArray()) {
            output.append(tables.get(c));
        }

        return output.toString();
    }
}
