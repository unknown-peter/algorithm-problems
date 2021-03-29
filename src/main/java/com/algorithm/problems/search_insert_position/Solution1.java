/**
 * Leetcode - search_insert_position
 */
package com.algorithm.problems.search_insert_position;

class Solution1 implements Solution {

    @Override
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target)
                return i;
        }

        return nums.length;
    }

}
