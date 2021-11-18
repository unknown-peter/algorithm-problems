/**
 * Leetcode - maximum_product_of_three_numbers
 */
package com.algorithm.problems.maximum_product_of_three_numbers;

import java.util.Arrays;

class Solution2 implements Solution {

    @Override
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3], nums[nums.length - 1] * nums[0] * nums[1]);
    }
}
