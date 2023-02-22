package com.taekrigi.algorithm.programmers.큐;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42586">programmers</a>
 */
public class 기능개발 {

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.add(getDeployedDay(progresses[i], speeds[i]));
        }

        return getDeployCount(queue);
    }

    private int getDeployedDay(int progress, int speed) {
        int day = 0;
        while (progress < 100) {
            progress += speed;
            day++;
        }
        return day;
    }

    private int[] getDeployCount(Queue<Integer> queue) {
        List<Integer> deployCount = new ArrayList<>();

        int max = queue.poll();
        int count = 1;

        while (!queue.isEmpty()) {
            int job = queue.poll();

            if (max < job) {
                deployCount.add(count);
                max = job;
                count = 1;
            } else {
                count++;
            }

            if (queue.isEmpty()) {
                deployCount.add(count);
            }
        }

        return deployCount.stream().mapToInt(i -> i).toArray();
    }
}
