/**
 * Leetcode - largest_perimeter_triangle
 */
package com.algorithm.problems.largest_perimeter_triangle;

import java.util.Arrays;

class Solution2 implements Solution {

    @Override
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 3; i >= 0; i--) {
            if (nums[i] + nums[i + 1] > nums[i + 2]) return nums[i] + nums[i + 1] + nums[i + 2];
        }
        return 0;
    }
}
