/**
 * Leetcode - missing_number
 */
package com.algorithm.problems.missing_number;

class Solution4 implements Solution {

    /**
     * solution from leetcode
     * [0,n]和nums中的元素异或最后剩下的即为missing number
     */
    @Override
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}
