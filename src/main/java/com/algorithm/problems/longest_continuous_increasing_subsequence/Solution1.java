/**
 * Leetcode - longest_continuous_increasing_subsequence
 */
package com.algorithm.problems.longest_continuous_increasing_subsequence;

class Solution1 implements Solution {

    @Override
    public int findLengthOfLCIS(int[] nums) {
        int length = 1;
        int tmp = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) tmp++;
            else {
                length = Math.max(length, tmp);
                tmp = 1;
            }
        }
        return Math.max(length, tmp);
    }
}
