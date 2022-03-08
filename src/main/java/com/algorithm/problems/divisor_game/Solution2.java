/**
 * Leetcode - divisor_game
 */
package com.algorithm.problems.divisor_game;

class Solution2 implements Solution {

    /**
     * 循环遍历2~n之间的数，计算其是否为Alice可赢。
     * 对于数i，其内的所有可被整除的数j，如果i-j是不可赢的，则i是可赢的。
     * 即Alice先拿掉j，剩余的i-j对于Bob不可赢，则Alice赢
     */
    @Override
    public boolean divisorGame(int n) {
        boolean[] dp = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j != 0) continue;
                if (!dp[i - j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
