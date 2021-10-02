/**
 * Leetcode - max_consecutive_ones
 */
package com.algorithm.problems.max_consecutive_ones;

class Solution2 implements Solution {

    @Override
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int sum = 0;
        for (int num : nums) {
            sum = (sum + num) * num;
            max = Math.max(max, sum);
        }
        return max;
    }
}
