package com.taekrigi.algorithm.leetcode.array;

/**
 * @see <a href="https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/">leetcode</a>
 */
public class MaximumNumberOfWordsFoundInSentences {

    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sentences.length; i++) {
            String[] sentenceBlock = sentences[i].split(" ");
            int sentenceBlockSize = sentenceBlock.length;
            if (max < sentenceBlockSize) {
                max = sentenceBlockSize;
            }
        }
        return max;
    }
}
