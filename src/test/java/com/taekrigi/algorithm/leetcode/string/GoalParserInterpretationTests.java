package com.taekrigi.algorithm.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoalParserInterpretationTests {

    private static final GoalParserInterpretation goalParserInterpretation = new GoalParserInterpretation();

    @Test
    public void case1() {
        String command = "G()(al)";
        String output = "Goal";

        String result = goalParserInterpretation.interpret(command);

        assertEquals(result, output);
    }

    @Test
    public void case2() {
        String command = "G()()()()(al)";
        String output = "Gooooal";

        String result = goalParserInterpretation.interpret(command);

        assertEquals(result, output);
    }

    @Test
    public void case3() {
        String command = "(al)G(al)()()G";
        String output = "alGalooG";

        String result = goalParserInterpretation.interpret(command);

        assertEquals(result, output);
    }
}
