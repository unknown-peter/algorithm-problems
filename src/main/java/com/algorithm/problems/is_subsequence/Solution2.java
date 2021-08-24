/**
 * Leetcode - is_subsequence
 */
package com.algorithm.problems.is_subsequence;

class Solution2 implements Solution {

    @Override
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for (char ch : s.toCharArray()) {
            index = t.indexOf(ch, index + 1);
            if (index == -1) return false;
        }
        return true;
    }
}
