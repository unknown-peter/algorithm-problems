/**
 * Leetcode - longest_harmonious_subsequence
 */
package com.algorithm.problems.longest_harmonious_subsequence;

import java.util.Arrays;

class Solution5 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int prev_count = 1, res = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if (i > 0 && nums[i] - nums[i - 1] == 1) {
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    count++;
                    i++;
                }
                res = Math.max(res, count + prev_count);
                prev_count = count;
            } else {
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    count++;
                    i++;
                }
                prev_count = count;
            }
        }
        return res;
    }
}
