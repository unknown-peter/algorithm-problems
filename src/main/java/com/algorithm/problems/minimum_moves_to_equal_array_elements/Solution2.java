/**
 * Leetcode - minimum_moves_to_equal_array_elements
 */
package com.algorithm.problems.minimum_moves_to_equal_array_elements;

import java.util.Arrays;

class Solution2 implements Solution {

    /**
     * 数组nums排序，记录最大值及最大值之前的index，最大值的个数为nums.length - 1 - index
     * 则所有最大值经过(nums.length - 1 - index)轮加1，最终变为max + (nums.length - 1 - index - 1)
     * 循环直到index < 0
     */
    @Override
    public int minMoves(int[] nums) {
        if (nums.length == 1) return 0;
        if (nums.length == 2) return (nums[1] - nums[0]);
        Arrays.sort(nums);
        if (nums[0] == nums[nums.length - 1]) return 0;

        int moves = 0;
        int index = nums.length - 1;
        int max = nums[nums.length - 1];
        while (index >= 0) {
            while ((index >= 0) && ((nums[index] + moves) == max)) index--;
            if (index >= 0) {
                moves += (nums.length - 1 - index);
                max += (nums.length - 1 - index - 1);
            }
        }
        return moves;
    }
}
