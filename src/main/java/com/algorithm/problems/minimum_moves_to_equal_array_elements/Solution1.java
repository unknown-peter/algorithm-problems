/**
 * Leetcode - minimum_moves_to_equal_array_elements
 */
package com.algorithm.problems.minimum_moves_to_equal_array_elements;

import java.util.Arrays;

class Solution1 implements Solution {

    /**
     * 数组nums排序并将前n-1元素加1
     * 重复该操作直到nums[0] == nums[nums.length - 1]
     */
    @Override
    public int minMoves(int[] nums) {
        if (nums.length == 1) return 0;
        if (nums.length == 2) return (nums[1] - nums[0]);
        Arrays.sort(nums);
        if (nums[0] == nums[nums.length - 1]) return 0;

        int moves = 0;
        while (nums[0] != nums[nums.length - 1]) {
            for (int i = 0; i < nums.length - 1; i++) nums[i]++;
            moves++;
            Arrays.sort(nums);
        }
        return moves;
    }
}
