/**
 * Leetcode - jump_game
 */
package com.algorithm.problems.jump_game;

class Solution2 implements Solution {

    /**
     * 回溯算法
     * 对各索引i，从最远处nums[i]开始递归回溯判断，只要有一个能够到达最后索引位置即返回true
     */
    @Override
    public boolean canJump(int[] nums) {
        return backtrack(nums, 0);
    }

    private boolean backtrack(int[] nums, int i) {
        if ((i + nums[i]) >= nums.length - 1) return true;
        for (int j = nums[i]; j > 0; j--) {
            if (backtrack(nums, i + j)) return true;
        }
        return false;
    }
}
