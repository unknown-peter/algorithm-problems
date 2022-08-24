/**
 * Leetcode - three_sum_closest
 */
package com.algorithm.problems.three_sum_closest;

import java.util.Arrays;

class Solution1 implements Solution {

    @Override
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int val = nums[i] + nums[j] + nums[k] - target;
                if (Math.abs(val) < diff) {
                    diff = Math.abs(val);
                    res = nums[i] + nums[j] + nums[k];
                }
                if (val == 0) return target;
                if (val > 0) k--;
                else j++;
            }
        }
        return res;
    }
}
