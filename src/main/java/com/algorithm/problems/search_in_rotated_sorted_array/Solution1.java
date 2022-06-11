/**
 * Leetcode - search_in_rotated_sorted_array
 */
package com.algorithm.problems.search_in_rotated_sorted_array;

class Solution1 implements Solution {

    @Override
    public int search(int[] nums, int target) {
        if (nums.length == 1) return (nums[0] == target) ? 0 : -1;
        if (nums[0] == target) return 0;
        if (nums[nums.length - 1] == target) return nums.length - 1;

        int res = -1;
        if (target < nums[0]) {
            for (int i = nums.length - 1; i > 0; i--) {
                if (nums[i] == target) return i;
                if (nums[i - 1] > nums[i]) break;
            }
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == target) return i;
                if (nums[i] > nums[i + 1]) break;
            }
        }
        return res;
    }
}
