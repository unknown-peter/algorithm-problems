/**
 * Leetcode - sort_array_by_parity_ii
 */
package com.algorithm.problems.sort_array_by_parity_ii;

class Solution2 implements Solution {

    @Override
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;
        while (i < nums.length && j < nums.length) {
            if (nums[i] % 2 > nums[j] % 2) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }

            if (nums[i] % 2 == 0) i += 2;
            if (nums[j] % 2 == 1) j += 2;
        }
        return nums;
    }
}
