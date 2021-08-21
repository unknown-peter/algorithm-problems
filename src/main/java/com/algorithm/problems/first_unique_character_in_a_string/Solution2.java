/**
 * Leetcode - first_unique_character_in_a_string
 */
package com.algorithm.problems.first_unique_character_in_a_string;

import java.util.HashMap;
import java.util.Map;

class Solution2 implements Solution {

    @Override
    public int firstUniqChar(String s) {
        Map<Character, Integer> chCountMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer count = chCountMap.get(s.charAt(i));
            if (count == null) count = 0;
            chCountMap.put(s.charAt(i), count + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (chCountMap.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
