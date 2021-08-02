/**
 * Leetcode - move_zeroes
 */
package com.algorithm.problems.move_zeroes;

class Solution4 implements Solution {

    /**
     * solution from leetcode
     * 使用指针lastNonZeroFoundAt指向数组头部，遍历数组，当元素不为0时，
     * 交换当前位置元素与lastNonZeroFoundAt位置元素，lastNonZeroFoundAt后移，
     * 则非0元素均在lastNonZeroFoundAt前
     */
    @Override
    public void moveZeroes(int[] nums) {
        for (int lastNonZeroFoundAt = 0, cur = 0; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                int tmp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[cur];
                nums[cur] = tmp;
                lastNonZeroFoundAt++;
            }
        }
    }
}
