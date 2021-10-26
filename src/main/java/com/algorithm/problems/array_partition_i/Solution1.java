/**
 * Leetcode - array_partition_i
 */
package com.algorithm.problems.array_partition_i;

import java.util.Arrays;

class Solution1 implements Solution {

    /**
     * nums数组排序，奇数位相加即可
     */
    @Override
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }
}
