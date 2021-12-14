/**
 * Leetcode - binary_search
 */
package com.algorithm.problems.binary_search;

class Solution1 implements Solution {

    @Override
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }
}
