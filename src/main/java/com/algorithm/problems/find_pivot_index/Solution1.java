/**
 * Leetcode - find_pivot_index
 */
package com.algorithm.problems.find_pivot_index;

class Solution1 implements Solution {

    @Override
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int tmpSum = 0;
        for (int num : nums) sum += num;
        for (int i = 0; i < nums.length; i++) {
            if (tmpSum == (sum - tmpSum - nums[i])) return i;
            tmpSum += nums[i];
        }
        return -1;
    }
}
