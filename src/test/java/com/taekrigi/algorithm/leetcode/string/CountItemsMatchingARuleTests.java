package com.taekrigi.algorithm.leetcode.string;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountItemsMatchingARuleTests {

    private static final CountItemsMatchingARule countItemsMatchingARule = new CountItemsMatchingARule();

    @Test
    public void case1() {
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );
        String ruleKey = "color";
        String ruleValue = "silver";

        int output = 1;

        int result = countItemsMatchingARule.countMatches(items, ruleKey, ruleValue);

        assertEquals(result, output);
    }

    @Test
    public void case2() {
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "phone"),
                List.of("phone", "gold", "iphone")
        );
        String ruleKey = "type";
        String ruleValue = "phone";

        int output = 2;

        int result = countItemsMatchingARule.countMatches(items, ruleKey, ruleValue);

        assertEquals(result, output);
    }
}
