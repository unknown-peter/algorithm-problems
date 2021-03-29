/**
 * Leetcode - remove_element
 */
package com.algorithm.problems.remove_element;

class Solution1 implements Solution {

    @Override
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
            return 0;

        int preIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val)
                continue;

            // 元素不等于val且两指针不重合的情况下赋值
            if (i != preIndex) {
                nums[preIndex] = nums[i];
                // nums[i] = val;
            }
            preIndex++;
        }

        return preIndex;
    }

}
