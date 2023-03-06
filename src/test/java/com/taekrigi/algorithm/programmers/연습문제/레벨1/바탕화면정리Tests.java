package com.taekrigi.algorithm.programmers.연습문제.레벨1;

import com.taekrigi.algorithm.programmers.연습문제.레벨1.바탕화면정리;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class 바탕화면정리Tests {

    private static final 바탕화면정리 backgroundArrangement = new 바탕화면정리();

    @Test
    public void case1() {
        String[] wallpapers = {".#...", "..#..", "...#."};
        int[] result = {0, 1, 3, 4};

        int[] output = backgroundArrangement.solution(wallpapers);

        assertArrayEquals(output, result);
    }

    @Test
    public void case2() {
        String[] wallpapers = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        int[] result = {1, 3, 5, 8};

        int[] output = backgroundArrangement.solution(wallpapers);

        assertArrayEquals(output, result);
    }

    @Test
    public void case3() {
        String[] wallpapers = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        int[] result = {0, 0, 7, 9};

        int[] output = backgroundArrangement.solution(wallpapers);

        assertArrayEquals(output, result);
    }

    @Test
    public void case4() {
        String[] wallpapers = {"..", "#."};
        int[] result = {1, 0, 2, 1};

        int[] output = backgroundArrangement.solution(wallpapers);

        assertArrayEquals(output, result);
    }
}
