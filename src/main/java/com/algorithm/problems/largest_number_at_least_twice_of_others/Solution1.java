/**
 * Leetcode - largest_number_at_least_twice_of_others
 */
package com.algorithm.problems.largest_number_at_least_twice_of_others;

class Solution1 implements Solution {

    @Override
    public int dominantIndex(int[] nums) {
        int max = -1;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        for (int num : nums) {
            if (num == max) continue;
            if (num * 2 > max) return -1;
        }
        return index;
    }
}
