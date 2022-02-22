/**
 * Leetcode - squares_of_a_sorted_array
 */
package com.algorithm.problems.squares_of_a_sorted_array;

import java.util.Arrays;

class Solution1 implements Solution {

    @Override
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) nums[i] = nums[i] * nums[i];
        Arrays.sort(nums);
        return nums;
    }
}
