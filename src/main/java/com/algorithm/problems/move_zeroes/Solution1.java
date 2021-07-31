/**
 * Leetcode - move_zeroes
 */
package com.algorithm.problems.move_zeroes;

class Solution1 implements Solution {

    @Override
    public void moveZeroes(int[] nums) {
        int p = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                for (int j = i; j < p; j++) nums[j] = nums[j + 1];
                nums[p] = 0;
                p--;
            }
        }
    }
}
