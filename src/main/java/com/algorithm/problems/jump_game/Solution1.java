/**
 * Leetcode - jump_game
 */
package com.algorithm.problems.jump_game;

class Solution1 implements Solution {

    /**
     * 贪心算法
     * 向右遍历,记录当前可以跳到的最远索引cur，当cur<i时说明当前已经到达不了i位置直接返回false
     */
    @Override
    public boolean canJump(int[] nums) {
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (cur < i) return false;
            cur = Math.max(cur, i + nums[i]);
        }
        return cur >= nums.length - 1;
    }
}
