/**
 * Leetcode - max_consecutive_ones
 */
package com.algorithm.problems.max_consecutive_ones;

class Solution1 implements Solution {

    @Override
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int tmp = 0;
        for (int num : nums) {
            tmp = (num == 0) ? 0 : tmp + 1;
            max = Math.max(max, tmp);
        }
        return max;
    }
}
