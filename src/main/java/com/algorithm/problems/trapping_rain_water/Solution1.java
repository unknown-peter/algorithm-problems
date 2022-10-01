/**
 * Leetcode - trapping_rain_water
 */
package com.algorithm.problems.trapping_rain_water;

class Solution1 implements Solution {

    /**
     * 每个柱子能接到的雨水是由其左右最长柱子中短的那根决定的，
     * 如果大于当前柱子长度，则接到的雨水为其差值；如果小于等于当前柱子长度，则接不到雨水
     * 因此使用left、right两个数组表示元素左边、右边最长柱子高度，计算其最小值与当前柱子高度值之差累加即为总共接到的雨水量
     */
    @Override
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        right[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            res += Math.min(left[i], right[i]) - height[i];
        }
        return res;
    }
}
