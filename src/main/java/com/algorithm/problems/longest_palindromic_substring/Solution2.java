/**
 * Leetcode - longest_palindromic_substring
 */
package com.algorithm.problems.longest_palindromic_substring;

class Solution2 implements Solution {

    /**
     * 对于字符串构建dp数组，dp[i][j]表示字符串s从i到j子串是否为回文串
     * 对于dp[i][j]，如果dp[i+1][j-1]是回文串而且s[i]==s[j]，则dp[i][j]为回文串
     */
    @Override
    public String longestPalindrome(String s) {
        if (s == null || (s.length() == 0)) return "";

        int l = s.length();
        boolean[][] dp = new boolean[l][l];
        String res = "";
        for (int j = 0; j < l; j++) {
            for (int i = 0; i <= j; i++) {
                if (i == j) dp[i][j] = true;
                else if (((i + 1) == j) && s.charAt(i) == s.charAt(j)) dp[i][j] = true;
                else if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) dp[i][j] = true;

                if (dp[i][j] && res.length() < (j - i + 1)) res = s.substring(i, j + 1);
            }
        }
        return res;
    }
}
