/**
 * Leetcode - maximum_subarray
 */
package com.algorithmproblems.maximum_subarray;

class Solution2 implements Solution {

    /**
     * 分治算法(divide and conquer)
     */
    @Override
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        return maxSubArray(nums, 0, nums.length - 1);
    }

    /**
     * 取数组中位数，计算以其为中心的子数组最大值、左子数组最大值、右子数组最大值，取其中的最大值
     */
    private int maxSubArray(int[] nums, int l, int h) {
        if (l >= h)
            return nums[l];

        int mid = l + (h - l) / 2;
        int midSum = nums[mid];
        int midMaxSum = midSum;
        for (int i = mid - 1; i >= l; i--) {
            midSum += nums[i];
            if (midSum > midMaxSum)
                midMaxSum = midSum;
        }
        midSum = midMaxSum;
        for (int i = mid + 1; i <= h; i++) {
            midSum += nums[i];
            if (midSum > midMaxSum)
                midMaxSum = midSum;
        }

        return Math.max(midMaxSum,
                Math.max(maxSubArray(nums, l, mid), maxSubArray(nums, mid + 1, h)));
    }
}
