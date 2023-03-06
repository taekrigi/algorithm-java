package com.taekrigi.algorithm.programmers.연습문제.레벨1;

/**
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/161990">programmers</a>
 */
public class 바탕화면정리 {

    public int[] solution(String[] wallpaper) {
        int top = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        int bottom = 0;
        int right = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    top = Math.min(top, i);
                    left = Math.min(left, j);
                    bottom = Math.max(bottom, i);
                    right = Math.max(right, j);
                }
            }
        }
        return new int[]{top, left, bottom + 1, right + 1};
    }
}
