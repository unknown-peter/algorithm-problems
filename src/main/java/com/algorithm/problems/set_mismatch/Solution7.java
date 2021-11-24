/**
 * Leetcode - set_mismatch
 */
package com.algorithm.problems.set_mismatch;

class Solution7 implements Solution {

    /**
     * 缺少的数字为m, 重复的数字为d
     * diff=m-d, sum=m+d=(m^2-d^2)/(m-d)
     * d=(sum-diff)/2, m=(sum+diff)/2
     */
    @Override
    public int[] findErrorNums(int[] nums) {
        int sum = 0;
        int diff = 0;
        for (int i = 0; i < nums.length; i++) {
            diff += i + 1 - nums[i];
            sum += (i + 1) * (i + 1) - nums[i] * nums[i];
        }
        sum = sum / diff;
        return new int[]{(sum - diff) / 2, (sum + diff) / 2};
    }
}
