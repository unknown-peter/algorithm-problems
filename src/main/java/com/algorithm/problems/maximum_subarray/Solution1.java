/**
 * Leetcode - maximum_subarray
 */
package com.algorithm.problems.maximum_subarray;

class Solution1 implements Solution {

    @Override
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int tmpSum = nums[0];
        int maxSum = tmpSum;
        for (int i = 1; i < nums.length; i++) {
            // 数组元素相加之和为负数时，替换为当前数组元素。从相加之和中比较找出相加最大的子数组和
            tmpSum = (tmpSum > 0) ? (tmpSum + nums[i]) : nums[i];
            if (tmpSum > maxSum) {
                maxSum = tmpSum;
            }
        }
        return maxSum;
    }

}
