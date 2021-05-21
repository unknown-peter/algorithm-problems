/**
 * Leetcode - majority_element
 */
package com.algorithm.problems.majority_element;

import java.util.Arrays;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     * 对数组排序，则中间位置为majority element
     */
    @Override
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
