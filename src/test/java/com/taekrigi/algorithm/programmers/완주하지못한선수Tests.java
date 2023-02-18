package com.taekrigi.algorithm.programmers;

import com.taekrigi.algorithm.programmers.해시.완주하지못한선수;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 완주하지못한선수Tests {

    private static final 완주하지못한선수 nonCompletionPlayer = new 완주하지못한선수();

    @Test
    public void case1() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        String output = "leo";

        String result = nonCompletionPlayer.solution(participant, completion);

        assertEquals(result, output);
    }

    @Test
    public void case2() {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String output = "vinko";

        String result = nonCompletionPlayer.solution(participant, completion);

        assertEquals(result, output);
    }

    @Test
    public void case3() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String output = "mislav";

        String result = nonCompletionPlayer.solution(participant, completion);

        assertEquals(result, output);
    }
}
