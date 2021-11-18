/**
 * Leetcode - maximum_product_of_three_numbers
 */
package com.algorithm.problems.maximum_product_of_three_numbers;

class Solution1 implements Solution {

    @Override
    public int maximumProduct(int[] nums) {
        if (nums.length == 3) return nums[0] * nums[1] * nums[2];
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    maxProduct = Math.max(maxProduct, nums[i] * nums[j] * nums[k]);
                }
            }
        }
        return maxProduct;
    }
}
