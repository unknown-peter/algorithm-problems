/**
 * Leetcode - repeated_substring_pattern
 */
package com.algorithm.problems.repeated_substring_pattern;

class Solution4 implements Solution {

    @Override
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i != 0) continue;
            if (s.substring(0, i).equals(s.substring(n - i))
                    && s.substring(0, n - i).equals(s.substring(i))) return true;
        }
        return false;
    }
}
