/**
 * Leetcode - repeated_substring_pattern
 */
package com.algorithm.problems.repeated_substring_pattern;

class Solution2 implements Solution {

    @Override
    public boolean repeatedSubstringPattern(String s) {
        for (int i = s.length() / 2; i > 0; i--) {
            if (s.length() % i == 0) {
                int count = s.length() / i;
                String str = "";
                String substring = s.substring(0, i);
                for (int j = 0; j < count; j++) str = str + substring;
                if (str.equals(s)) return true;
            }
        }
        return false;
    }
}
