/**
 * Leetcode - missing_number
 */
package com.algorithm.problems.missing_number;

class Solution5 implements Solution {

    /**
     * solution from leetcode
     * Gauss' Formula
     */
    @Override
    public int missingNumber(int[] nums) {
        int expectedSum = nums.length * (nums.length + 1) / 2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }
}
