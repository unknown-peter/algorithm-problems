/**
 * Leetcode - word_pattern
 */
package com.algorithm.problems.word_pattern;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> csMap = new HashMap<>();
        Map<String, Character> scMap = new HashMap<>();
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;
        for (int i = 0; i < pattern.length(); i++) {
            String w = csMap.get(pattern.charAt(i));
            Character c = scMap.get(words[i]);
            if (w != null && c != null) {
                if (!w.equals(words[i]) || !c.equals(pattern.charAt(i))) return false;
            } else if (w == null && c == null) {
                csMap.put(pattern.charAt(i), words[i]);
                scMap.put(words[i], pattern.charAt(i));
            } else return false;
        }
        return true;
    }
}
