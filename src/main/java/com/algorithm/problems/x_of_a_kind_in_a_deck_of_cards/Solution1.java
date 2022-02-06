/**
 * Leetcode - x_of_a_kind_in_a_deck_of_cards
 */
package com.algorithm.problems.x_of_a_kind_in_a_deck_of_cards;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> numCountMap = new HashMap<>();
        for (int num : deck) {
            numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
        }
        int minCount = 10001;
        for (int count : numCountMap.values()) {
            minCount = Math.min(minCount, count);
        }
        if (minCount < 2) return false;

        tag:
        for (int i = 2; i <= minCount; i++) {
            for (int count : numCountMap.values()) {
                if (count % i != 0) continue tag;
            }
            return true;
        }
        return false;
    }
}
