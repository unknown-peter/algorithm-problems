/**
 * Leetcode - set_mismatch
 */
package com.algorithm.problems.set_mismatch;

import java.util.Arrays;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int dup = -1, missing = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                dup = nums[i];
            else if (nums[i] > nums[i - 1] + 1)
                missing = nums[i - 1] + 1;
        }
        return new int[]{dup, nums[nums.length - 1] != nums.length ? nums.length : missing};
    }
}
