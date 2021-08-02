/**
 * Leetcode - move_zeroes
 */
package com.algorithm.problems.move_zeroes;

class Solution1 implements Solution {

    /**
     * 用p作为指针指向数组尾部，从后遍历数组，遇到0时将0之后到p位置的内容向前移并结尾补0，p指针前移
     */
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
