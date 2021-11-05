/**
 * Leetcode - longest_harmonious_subsequence
 */
package com.algorithm.problems.longest_harmonious_subsequence;

import java.util.Arrays;

class Solution1 implements Solution {

    @Override
    public int findLHS(int[] nums) {
        int preCount = 0;
        int curCount = 1;
        int sum = 0;
        Arrays.sort(nums);
        int i = 1;
        while (i < nums.length) {
            while (i < nums.length && nums[i] == nums[i - 1]) {
                curCount++;
                i++;
            }
            if (preCount != 0 && curCount != 0) sum = Math.max(sum, preCount + curCount);
            if (i >= nums.length) break;
            if ((nums[i] - nums[i - 1]) == 1) {
                preCount = curCount;
                curCount = 1;
            } else {
                preCount = 0;
                curCount = 1;
            }
            i++;
        }
        if (preCount != 0 && curCount != 0) sum = Math.max(sum, preCount + curCount);
        return sum;
    }
}
