/**
 * Leetcode - maximum_average_subarray_i
 */
package com.algorithm.problems.maximum_average_subarray_i;

class Solution1 implements Solution {

    @Override
    public double findMaxAverage(int[] nums, int k) {
        double sum = Double.NEGATIVE_INFINITY;
        for (int i = 0; i <= nums.length - k; i++) {
            double tmp = 0;
            for (int j = i; j < i + k; j++) {
                tmp += nums[j];
            }
            sum = Math.max(sum, tmp);
        }
        return sum / k;
    }
}
