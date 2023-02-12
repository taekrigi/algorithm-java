package com.taekrigi.algorithm.leetcode.hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeTheMessageTests {

    private static final DecodeTheMessage decodeTheMessage = new DecodeTheMessage();

    @Test
    public void case1() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String output = "this is a secret";

        String result = decodeTheMessage.decodeMessage(key, message);

        assertEquals(result, output);
    }

    @Test
    public void case2() {
        String key = "eljuxhpwnyrdgtqkviszcfmabo";
        String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        String output = "the five boxing wizards jump quickly";

        String result = decodeTheMessage.decodeMessage(key, message);

        assertEquals(result, output);
    }
}
