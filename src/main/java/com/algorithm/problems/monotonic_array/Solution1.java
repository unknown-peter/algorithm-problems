/**
 * Leetcode - monotonic_array
 */
package com.algorithm.problems.monotonic_array;

class Solution1 implements Solution {

    @Override
    public boolean isMonotonic(int[] nums) {
        if (nums.length < 3) return true;
        boolean isAsc = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                isAsc = false;
                break;
            }
        }
        if (isAsc) return true;

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) return false;
        }
        return true;
    }
}
