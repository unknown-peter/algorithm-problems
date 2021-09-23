/**
 * Leetcode - repeated_substring_pattern
 */
package com.algorithm.problems.repeated_substring_pattern;

class Solution1 implements Solution {

    @Override
    public boolean repeatedSubstringPattern(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (repeatedSubstringPattern(s, i + 1)) return true;
        }
        return false;
    }

    private boolean repeatedSubstringPattern(String s, int num) {
        if (s.length() % num != 0) return false;

        int cnt = s.length() / num;
        String subStr = s.substring(0, num);
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < subStr.length(); j++) {
                if (subStr.charAt(j) != s.charAt(i * subStr.length() + j)) return false;
            }
        }
        return true;
    }
}
