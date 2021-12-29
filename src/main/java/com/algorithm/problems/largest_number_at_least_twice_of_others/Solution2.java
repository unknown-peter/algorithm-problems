/**
 * Leetcode - largest_number_at_least_twice_of_others
 */
package com.algorithm.problems.largest_number_at_least_twice_of_others;

class Solution2 implements Solution {

    @Override
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > secondMax) secondMax = nums[i];
        }
        return (max < 2 * secondMax) ? -1 : index;
    }
}
