/**
 * Leetcode - maximum_average_subarray_i
 */
package com.algorithm.problems.maximum_average_subarray_i;

class Solution2 implements Solution {

    @Override
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum / k;
    }
}
