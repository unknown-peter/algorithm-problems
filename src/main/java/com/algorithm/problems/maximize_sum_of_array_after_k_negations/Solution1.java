/**
 * Leetcode - maximize_sum_of_array_after_k_negations
 */
package com.algorithm.problems.maximize_sum_of_array_after_k_negations;

import java.util.Arrays;

class Solution1 implements Solution {

    /**
     * nums数组排序。遍历数组，对于数组中元素num小于0且在k个之内时，由前向后sum加-num，否则加num，
     * 同时计算数组中最小绝对值数minAbs。
     * 遍历后如果k>0且k为奇数，则minAbs要为负数，由于之前遍历加的minAbs为正数，所以要从sum中减去2*minAbs
     * 其余的返回sum即可
     */
    @Override
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        int sum = 0;
        int minAbs = 101;
        for (int num : nums) {
            if (num < 0 && k > 0) {
                sum += -num;
                k--;
            } else sum += num;
            minAbs = Math.min(minAbs, Math.abs(num));
        }

        return sum - (k & 1) * 2 * minAbs;
    }
}
