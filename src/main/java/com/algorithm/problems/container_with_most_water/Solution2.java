/**
 * Leetcode - container_with_most_water
 */
package com.algorithm.problems.container_with_most_water;

class Solution2 implements Solution {

    /**
     * 左右双指针，左右两边高度小的那一侧指针向中间靠拢，计算面积
     */
    @Override
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while (left < right) {
            int tmp = Math.min(height[left], height[right]) * (right - left);
            if (res < tmp) res = tmp;
            if (height[left] > height[right]) right--;
            else left++;
        }
        return res;
    }
}
