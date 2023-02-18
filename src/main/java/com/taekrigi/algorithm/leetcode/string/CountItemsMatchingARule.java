package com.taekrigi.algorithm.leetcode.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://leetcode.com/problems/count-items-matching-a-rule/">leetcode</a>
 */
public class CountItemsMatchingARule {

    private static Map<String, Integer> map = new HashMap<>();

    static {
        map.put("type", 0);
        map.put("color", 1);
        map.put("name", 2);
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = map.get(ruleKey);
        int count = 0;

        for (int i = 0; i < items.size(); i++) {
            if (ruleValue.equals(items.get(i).get(index))) {
                count++;
            }
        }
        return count;
    }


}
