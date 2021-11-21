/**
 * Leetcode - maximum_average_subarray_i
 */
package com.algorithm.problems.maximum_average_subarray_i;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public double findMaxAverage(int[] nums, int k) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            sum[i] = sum[i - 1] + nums[i];
        double res = sum[k - 1] * 1.0 / k;
        for (int i = k; i < nums.length; i++) {
            res = Math.max(res, (sum[i] - sum[i - k]) * 1.0 / k);
        }
        return res;
    }
}
