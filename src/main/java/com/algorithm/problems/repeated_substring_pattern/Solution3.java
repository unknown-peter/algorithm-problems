/**
 * Leetcode - repeated_substring_pattern
 */
package com.algorithm.problems.repeated_substring_pattern;

class Solution3 implements Solution {

    /**
     * KMP算法，满足字符串重复数dp[n]不为0 且 重复数之前的数目能被dp[n]整除
     * 字符串        abcabcabc
     * 字符串重复数  0000123456
     */
    @Override
    public boolean repeatedSubstringPattern(String s) {
        int i = 1;
        int j = 0;
        int n = s.length();
        int[] dp = new int[n + 1];

        while (i < n) {
            if (s.charAt(i) == s.charAt(j)) dp[++i] = ++j;
            else if (j == 0) ++i;
            else j = dp[j];
        }
        return dp[n] != 0 && (dp[n] % (n - dp[n]) == 0);
    }
}
