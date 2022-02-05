/**
 * Leetcode - smallest_range_i
 */
package com.algorithm.problems.smallest_range_i;

class Solution1 implements Solution {

    @Override
    public int smallestRangeI(int[] nums, int k) {
        int min = 10001;
        int max = -1;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return ((max - min) <= 2 * k) ? 0 : (max - min - 2 * k);
    }
}
