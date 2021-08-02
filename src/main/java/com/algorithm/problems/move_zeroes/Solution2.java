/**
 * Leetcode - move_zeroes
 */
package com.algorithm.problems.move_zeroes;

class Solution2 implements Solution {

    /**
     * 使用指针p指向数组头部，遍历数组，当元素不为0时，将元素设置到p所指向位置，指针p后移。
     * 遍历完后将p到数组末尾的元素置为0
     */
    @Override
    public void moveZeroes(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[p++] = nums[i];
            }
        }
        for (int i = p; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
