/**
 * Leetcode - relative_ranks
 */
package com.algorithm.problems.relative_ranks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    private String[] rank = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};

    @Override
    public String[] findRelativeRanks(int[] score) {
        int[] array = Arrays.copyOf(score, score.length);
        Arrays.sort(array);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = array.length - 1; i >= 0; i--) {
            map.put(array[i], array.length - 1 - i);
        }
        String[] strArray = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int pos = map.get(score[i]);
            strArray[i] = (pos < 3) ? rank[pos] : String.valueOf(pos + 1);
        }
        return strArray;
    }
}
