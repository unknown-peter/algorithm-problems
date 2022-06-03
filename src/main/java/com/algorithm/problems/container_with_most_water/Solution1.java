/**
 * Leetcode - container_with_most_water
 */
package com.algorithm.problems.container_with_most_water;

class Solution1 implements Solution {

    @Override
    public int maxArea(int[] height) {
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int tmp = Math.min(height[i], height[j]) * (j - i);
                if (tmp > res) res = tmp;
            }
        }
        return res;
    }
}
