/**
 * Leetcode - minimum_moves_to_equal_array_elements
 */
package com.algorithm.problems.minimum_moves_to_equal_array_elements;

class Solution3 implements Solution {

    /**
     * sum + (n - 1) * round = n * x
     * x = min(num) + round
     * round = sum - n * min(num) = nums[n-1] - min(num) + nums[n-2] - min(num) + ... + nums[0] - min(num)
     */
    @Override
    public int minMoves(int[] nums) {
        int moves = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) min = Math.min(min, nums[i]);
        for (int i = 0; i < nums.length; i++) moves += (nums[i] - min);
        return moves;

//        int sum = 0;
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            min = Math.min(min, nums[i]);
//        }
//        return sum - nums.length * min;
    }
}
