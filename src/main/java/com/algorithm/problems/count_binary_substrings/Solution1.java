/**
 * Leetcode - count_binary_substrings
 */
package com.algorithm.problems.count_binary_substrings;

class Solution1 implements Solution {

    @Override
    public int countBinarySubstrings(String s) {
        int curCount = 1;
        int preCount = 0;
        int res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) curCount++;
            else {
                res += Math.min(preCount, curCount);
                preCount = curCount;
                curCount = 1;
            }
        }
        return res + Math.min(preCount, curCount);
    }
}
