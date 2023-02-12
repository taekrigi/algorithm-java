package com.taekrigi.algorithm.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfWordsFoundInSentencesTests {

    private static final MaximumNumberOfWordsFoundInSentences maximumNumberOfWordsFoundInSentences
            = new MaximumNumberOfWordsFoundInSentences();

    @Test
    public void case1() {
        String[] sentences = new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int output = 6;

        int result = maximumNumberOfWordsFoundInSentences.mostWordsFound(sentences);

        assertEquals(result, output);
    }

    @Test
    public void case2() {
        String[] sentences = new String[] {"please wait", "continue to fight", "continue to win"};
        int output = 3;

        int result = maximumNumberOfWordsFoundInSentences.mostWordsFound(sentences);

        assertEquals(result, output);
    }
}
