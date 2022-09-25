/**
 * Leetcode - first_missing_positive
 */
package com.algorithm.problems.first_missing_positive;

class Solution2 implements Solution {

    /**
     * nums的长度为n，则结果值在1到n+1之间
     * 将nums中小于等于0的值重新设置为Integer.MAX_VALUE，这样这些无关值不在1到n范围内且所有nums的值均为正数
     * 将绝对值在1到n的nums元素numAbs与nums[numAbs - 1]做映射，nums里有的numAbs对应的nums[numAbs - 1]置为负
     * 从头开始遍历nums，第一个正数的索引index+1即为最小的缺失正数；如果遍历nums没有正数，则nums中的值就是1到n，n+1即为最小缺失正数
     */
    @Override
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) nums[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            int numAbs = Math.abs(nums[i]);
            if (numAbs <= n && nums[numAbs - 1] > 0) nums[numAbs - 1] = -nums[numAbs - 1];
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) return (i + 1);
        }
        return n + 1;
    }
}
