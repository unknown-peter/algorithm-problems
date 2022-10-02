/**
 * Leetcode - wildcard_matching
 */
package com.algorithm.problems.wildcard_matching;

class Solution2 implements Solution {

    /**
     * 使用动态规划方法，定义布尔数组dp[i][j]表示s前i个字符和p前j个字符是否匹配
     * 则dp[i][0]表示s前i个字符和空串比较是否匹配，除dp[0][0]外均为false
     * dp[0][j]表示空串和p前j个字符是否匹配，若匹配则前j个字符需要都是'*'
     * 对于其余dp[i][j]，如果p第j个字符为'*'，则dp[i][j] = dp[i-1][j] || dp[i][j-1]
     * 如果p第j个字符为'?'，则dp[i][j] = dp[i-1][j-1]
     * 如果p第j个字符为其余的小写字母，则dp[i][j] = dp[i-1][j-1] && s.charAt(i-1)==p.charAt(j-1)
     */
    @Override
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        if (s.isEmpty()) return p.charAt(0) == '*' && isMatch(s, p.substring(1));

        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int j = 0; j < n; j++) {
            dp[0][j + 1] = dp[0][j] && p.charAt(j) == '*';
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (p.charAt(j) == '*') dp[i + 1][j + 1] = dp[i][j + 1] || dp[i + 1][j];
                else if (p.charAt(j) == '?') dp[i + 1][j + 1] = dp[i][j];
                else dp[i + 1][j + 1] = dp[i][j] && s.charAt(i) == p.charAt(j);
            }
        }
        return dp[m][n];
    }
}
