/**
 * Leetcode - largest_perimeter_triangle
 */
package com.algorithm.problems.largest_perimeter_triangle;

class Solution1 implements Solution {

    @Override
    public int largestPerimeter(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] > nums[k] && nums[i] + nums[k] > nums[j]
                            && nums[j] + nums[k] > nums[i]) {
                        res = Math.max(res, nums[i] + nums[j] + nums[k]);
                    }
                }
            }
        }
        return res;
    }
}
