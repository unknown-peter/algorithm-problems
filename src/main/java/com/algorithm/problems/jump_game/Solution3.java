/**
 * Leetcode - jump_game
 */
package com.algorithm.problems.jump_game;

class Solution3 implements Solution {

    /**
     * 动态规划
     * dp[i]表示i点是否能跳到最后的索引位置，则dp[i] = dp[i+k] (0<k<=nums[i])
     * 即i能到达的位置中有能跳到最后索引位置的则i即可跳到最后索引位置
     * 由后向前遍历，判断dp[0]是否为true
     */
    @Override
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean dp[] = new boolean[n];
        dp[n - 1] = true;
        for (int i = n - 2; i >= 0; i--) {
            int ind = Math.min(i + nums[i], n - 1);
            for (int j = ind; j > i; j--) {
                if (dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[0];
    }
}
