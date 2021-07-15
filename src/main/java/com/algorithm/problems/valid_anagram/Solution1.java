/**
 * Leetcode - valid_anagram
 */
package com.algorithm.problems.valid_anagram;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            Integer sCount = sMap.get(sChar);
            sMap.put(sChar, (sCount == null) ? 1 : sCount + 1);
            char tChar = t.charAt(i);
            Integer tCount = tMap.get(tChar);
            tMap.put(tChar, (tCount == null) ? 1 : tCount + 1);
        }

        if (sMap.size() != tMap.size()) return false;
        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            if (!entry.getValue().equals(tMap.get(entry.getKey()))) return false;
        }
        return true;
    }
}
