/**
 * Leetcode - is_subsequence
 */
package com.algorithm.problems.is_subsequence;

class Solution1 implements Solution {

    @Override
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        return i == s.length();
    }
}
